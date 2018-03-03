package com.fiay.microserv.sysuser.api;

/**
 * API通用返回格式
 * Created by Fiay on 2018/2/27.
 */
public class ApiResult {

    public ApiResult(Integer code, String message, Object data, Integer size) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.size = size;
    }

    private Integer code;
    private String message;
    private Object data;
    private Integer size;

    public ApiResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
