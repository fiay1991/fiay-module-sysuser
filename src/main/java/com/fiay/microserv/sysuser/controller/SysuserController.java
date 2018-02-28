package com.fiay.microserv.sysuser.controller;

import com.fiay.microserv.sysuser.model.Sysuser;
import com.fiay.microserv.sysuser.service.SysuserService;
import com.fiay.microserv.sysuser.util.api.ApiResult;
import com.fiay.microserv.sysuser.util.api.ApiRoute;
import com.fiay.microserv.sysuser.viewobject.VOSysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = ApiRoute.USER_ACTION, method = RequestMethod.PUT)
    public ApiResult editSUPassword(@RequestParam("username") String username,
                                    @RequestParam("password") String oldPassword,
                                    @RequestParam("newPassword") String newPassword) {

        apiResult = new ApiResult();

        try {
            int result = sysuserService.editSUPassword(username, oldPassword, newPassword);
            apiResult.setCode(200);
            apiResult.setMessage("change password success");
            apiResult.setData(result);
        } catch (Exception e) {
            apiResult.setCode(503);
            apiResult.setMessage("change password exception");
            apiResult.setData(e.getLocalizedMessage());
        }
        return apiResult;
    }

    @RequestMapping(value = ApiRoute.USER_LOGIN, method = RequestMethod.GET)
    public ApiResult doSysuserLogin(@RequestParam("username") String username,
                                    @RequestParam("password") String password) {
        apiResult = new ApiResult();
        Sysuser sysuser = sysuserService.userLogin(username, password);
        if (sysuser != null) {
            apiResult.setCode(200);
            apiResult.setMessage("welcome " + sysuser.getSuNickname());
            apiResult.setData(VOSysuser.VOAction.buildLoginVO(sysuser));
        } else {
            apiResult.setCode(404);
            apiResult.setMessage("user not found");
            apiResult.setData(null);
        }

        return apiResult;
    }


}
