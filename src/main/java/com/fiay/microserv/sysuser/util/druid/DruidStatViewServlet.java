package com.fiay.microserv.sysuser.util.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.fiay.microserv.sysuser.api.ApiRoute;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Druid管理视图Servlet
 * Created by Fiay on 2018/2/27.
 */
@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = ApiRoute.DRUID_ALLOW_IP),
                @WebInitParam(name = "deny", value = ApiRoute.DRUID_DENY_IP),
                @WebInitParam(name = "loginUsername", value = ApiRoute.DRUID_USERNAME),
                @WebInitParam(name = "loginPassword", value = ApiRoute.DRUID_PASSWORD),
                @WebInitParam(name = "resetEnable", value = ApiRoute.DRUID_RESET_ALL)
        })
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 3846189457536752361L;
}