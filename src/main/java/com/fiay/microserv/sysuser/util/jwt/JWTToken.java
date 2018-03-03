package com.fiay.microserv.sysuser.util.jwt;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 基于Shiro实现Token令牌
 * Created by Fiay on 2018/3/2.
 */
public class JWTToken implements AuthenticationToken {

    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
