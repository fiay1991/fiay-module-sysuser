package com.fiay.microserv.sysuser.controller;

import com.fiay.microserv.sysuser.api.ApiResult;
import com.fiay.microserv.sysuser.api.ApiRoute;
import com.fiay.microserv.sysuser.model.Sysuser;
import com.fiay.microserv.sysuser.service.SysuserService;
import com.fiay.microserv.sysuser.util.jwt.JWTUtil;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 系统用户相关Controller
 * Created by Fiay on 2018/2/27.
 */
@RestController
public class SysuserController {

    @Autowired
    private SysuserService sysuserService;

    private ApiResult apiResult;

    /**
     * 添加系统用户
     *
     * @param username
     * @param password
     * @param nickname
     * @return
     */
    @RequiresRoles("admin")
    @RequestMapping(value = ApiRoute.USER_ACTION, method = RequestMethod.POST)
    public ApiResult addSysuser(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                @RequestParam("nickname") String nickname) {

        apiResult = new ApiResult();

        try {
            int result = sysuserService.addSU(username, password, nickname);
            apiResult.setCode(200);
            apiResult.setMessage("add sysuser success");
            apiResult.setData(result);
        } catch (Exception e) {
            apiResult.setCode(503);
            apiResult.setMessage("add sysuser exception");
            apiResult.setData(e.getLocalizedMessage());
        }
        return apiResult;
    }

    /**
     * 修改用户密码
     *
     * @param username
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @RequiresAuthentication
    @RequestMapping(value = ApiRoute.USER_ACTION, method = RequestMethod.PUT)
    public ApiResult editSUPassword(@RequestParam("username") String username,
                                    @RequestParam("password") String oldPassword,
                                    @RequestParam("newPassword") String newPassword) {

        apiResult = new ApiResult();

        try {
            int result = sysuserService.editSUPassword(username, oldPassword, newPassword);
            if (result > 0) {
                apiResult.setCode(200);
                apiResult.setMessage("change password success");
            } else {
                apiResult.setCode(404);
                apiResult.setMessage("wrong username or password");
            }
            apiResult.setData(result);
        } catch (Exception e) {
            apiResult.setCode(503);
            apiResult.setMessage("server error");
            apiResult.setData(e.getLocalizedMessage());
        }
        return apiResult;
    }

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = ApiRoute.USER_LOGIN, method = RequestMethod.GET)
    public ApiResult doSysuserLogin(@RequestParam("username") String username,
                                    @RequestParam("password") String password) {
        apiResult = new ApiResult();
        Sysuser sysuser = sysuserService.doSULogin(username, password);
        if (sysuser != null) {
            apiResult.setCode(200);
            apiResult.setMessage("welcome " + sysuser.getSuNickname());
            String token = JWTUtil.sign(sysuser.getSuUsername(), sysuser.getSuPasswordSalt());
            apiResult.setData(token);
        } else {
            apiResult.setCode(404);
            apiResult.setMessage("user not found");
            apiResult.setData(null);
        }

        return apiResult;
    }

    /**
     * 根据昵称查找用户
     *
     * @param nickname
     * @return
     */
    @RequiresRoles("admin")
    @RequiresPermissions(logical = Logical.AND, value = {"view", "search"})
    @RequestMapping(value = ApiRoute.USER_SEARCH, method = RequestMethod.GET)
    public ApiResult searchByNickname(@RequestParam("nickname") String nickname) {
        apiResult = new ApiResult();
        // 去除两端空格
        nickname = nickname.trim();
        if (nickname.length() < 3 || nickname.indexOf("%") > 0 || nickname.indexOf("*") > 0) {
            // 简单处理字符串判断输入是否符合
            apiResult.setCode(401);
            apiResult.setMessage("illegal input, at least 3 chars and not allowed '%' or '*'");
            apiResult.setSize(0);
            apiResult.setData(null);
            return apiResult;
        } else {
            // 开始搜索
            List<Sysuser> list = sysuserService.searchSU(nickname);
            if (list != null && list.size() > 0) {
                apiResult.setCode(200);
                apiResult.setMessage("keyword:'" + nickname + "' search success");
                apiResult.setSize(list.size());
                apiResult.setData(list);
            } else {
                apiResult.setCode(404);
                apiResult.setMessage("keyword:'" + nickname + "' has no result");
                apiResult.setSize(0);
                apiResult.setData(null);
            }
        }
        return apiResult;
    }

}
