package com.fiay.microserv.sysuser.viewobject;

import com.fiay.microserv.sysuser.model.Sysuser;

import java.util.Date;

/**
 * Created by Fiay on 2018/2/27.
 */
public class VOSysuser {

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 最后一次登录IP
     */
    private String lastLoginIp;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public VOSysuser() {
    }

    public static class VOAction {
        /**
         * 根据sysuser登录结果返回vo对象
         * @param sysuser
         * @return
         */
        public static VOSysuser buildLoginVO(Sysuser sysuser) {
            VOSysuser vo = new VOSysuser();
            vo.setUsername(sysuser.getSuUsername());
            vo.setNickname(sysuser.getSuNickname());
            vo.setLastLoginIp(sysuser.getSuLastLoginIp());
            vo.setLastLoginTime(sysuser.getSuLastLoginTime());
            return vo;
        }
    }
}
