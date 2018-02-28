package com.fiay.microserv.sysuser.util.api;

/**
 * API接口地址和配置定义
 * Created by Fiay on 2018/2/27.
 */
public interface ApiRoute {

    String CONTEXT_PATH = "/"; // 以/开头，以/结尾

    // Druid配置相关
    String DRUID_USERNAME = "fiay"; // 用户名
    String DRUID_PASSWORD = "fiay"; // 密码
    String DRUID_ALLOW_IP = ""; // IP白名单(没有配置或者为空，则允许所有访问)
    String DRUID_DENY_IP = "";  // IP黑名单 (存在共同时，deny优先于allow)
    String DRUID_RESET_ALL = "false"; // 禁用HTML页面上的“Reset All”功能

    // 获取API服务信息
    String GET_API_INFO = CONTEXT_PATH + "getApiInfo";
    /**
     *  用户相关操作
     *  POST    添加用户
     *  PUT     修改用户
     *  DELETE  删除用户
     */
    String USER_ACTION = CONTEXT_PATH + "action";
    /**
     *  查询相关操作
     *  GET     根据ID查询单个用户
     */
    String USER_INFO = CONTEXT_PATH + "info";
    /**
     *  搜索操作
     *  GET     根据关键字搜索用户列表
     *  POST    根据条件搜索用户列表
     */
    String USER_SEARCH = CONTEXT_PATH + "search";
    /**
     *  列表操作
     *  GET     获取指定页面数量的用户列表
     */
    String USER_LIST = CONTEXT_PATH + "list";
    /**
     *  用户登录
     *  GET     获取指定页面数量的用户列表
     */
    String USER_LOGIN = CONTEXT_PATH + "syslogin";
}
