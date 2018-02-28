package com.fiay.microserv.sysuser.util.api;

/**
 * API通用返回格式
 * Created by Fiay on 2018/2/27.
 */
public class ApiResult {

    private Integer code;
    private String message;
    private Object data;

    public ApiResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
