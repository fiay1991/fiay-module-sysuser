package com.fiay.microserv.sysuser.controller;

import com.fiay.microserv.sysuser.api.ApiInfo;
import com.fiay.microserv.sysuser.api.ApiResult;
import com.fiay.microserv.sysuser.api.ApiRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * API信息Controller
 * Created by Fiay on 2018/2/27.
 */
@RestController
public class ApiInfoController {

    @Autowired
    private ApiInfo apiInfo;

    /**
     * 访问获取api相关信息
     *
     * @return
     */
    @RequestMapping(value = ApiRoute.GET_API_INFO)
    public ApiResult getApiInfo() {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(200);
        apiResult.setMessage("service is now available");
        apiResult.setData(apiInfo);
        return apiResult;
    }

    /**
     * 非法访问跳转
     *
     * @return
     */
    @RequestMapping(value = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ApiResult redirect401() {
        return new ApiResult(401, "Unauthorized", null);
    }
}
