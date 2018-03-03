package com.fiay.microserv.sysuser.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户模型
 *
 * @author Fiay
 */
public class Sysuser implements Serializable {
    private Long id;

    /**
     * 用户名
     */
    private String suUsername;

    /**
     * 密码密文
     */
    @JsonIgnore
    private String suPassword;

    /**
     * 盐
     */
    @JsonIgnore
    private String suPasswordSalt;

    /**
     * 昵称
     */
    private String suNickname;

    /**
     * 用户来源
     */
    private Integer suFrom;

    /**
     * 最后一次登录IP
     */
    private String suLastLoginIp;

    /**
     * 最后一次登录时间
     */
    private Date suLastLoginTime;

    /**
     * 用户状态
     */
    private Integer suStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuUsername() {
        return suUsername;
    }

    public void setSuUsername(String suUsername) {
        this.suUsername = suUsername;
    }

    public String getSuPassword() {
        return suPassword;
    }

    public void setSuPassword(String suPassword) {
        this.suPassword = suPassword;
    }

    public String getSuPasswordSalt() {
        return suPasswordSalt;
    }

    public void setSuPasswordSalt(String suPasswordSalt) {
        this.suPasswordSalt = suPasswordSalt;
    }

    public String getSuNickname() {
        return suNickname;
    }

    public void setSuNickname(String suNickname) {
        this.suNickname = suNickname;
    }

    public Integer getSuFrom() {
        return suFrom;
    }

    public void setSuFrom(Integer suFrom) {
        this.suFrom = suFrom;
    }

    public String getSuLastLoginIp() {
        return suLastLoginIp;
    }

    public void setSuLastLoginIp(String suLastLoginIp) {
        this.suLastLoginIp = suLastLoginIp;
    }

    public Date getSuLastLoginTime() {
        return suLastLoginTime;
    }

    public void setSuLastLoginTime(Date suLastLoginTime) {
        this.suLastLoginTime = suLastLoginTime;
    }

    public Integer getSuStatus() {
        return suStatus;
    }

    public void setSuStatus(Integer suStatus) {
        this.suStatus = suStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Sysuser other = (Sysuser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getSuUsername() == null ? other.getSuUsername() == null : this.getSuUsername().equals(other.getSuUsername()))
                && (this.getSuPassword() == null ? other.getSuPassword() == null : this.getSuPassword().equals(other.getSuPassword()))
                && (this.getSuPasswordSalt() == null ? other.getSuPasswordSalt() == null : this.getSuPasswordSalt().equals(other.getSuPasswordSalt()))
                && (this.getSuNickname() == null ? other.getSuNickname() == null : this.getSuNickname().equals(other.getSuNickname()))
                && (this.getSuFrom() == null ? other.getSuFrom() == null : this.getSuFrom().equals(other.getSuFrom()))
                && (this.getSuLastLoginIp() == null ? other.getSuLastLoginIp() == null : this.getSuLastLoginIp().equals(other.getSuLastLoginIp()))
                && (this.getSuLastLoginTime() == null ? other.getSuLastLoginTime() == null : this.getSuLastLoginTime().equals(other.getSuLastLoginTime()))
                && (this.getSuStatus() == null ? other.getSuStatus() == null : this.getSuStatus().equals(other.getSuStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSuUsername() == null) ? 0 : getSuUsername().hashCode());
        result = prime * result + ((getSuPassword() == null) ? 0 : getSuPassword().hashCode());
        result = prime * result + ((getSuPasswordSalt() == null) ? 0 : getSuPasswordSalt().hashCode());
        result = prime * result + ((getSuNickname() == null) ? 0 : getSuNickname().hashCode());
        result = prime * result + ((getSuFrom() == null) ? 0 : getSuFrom().hashCode());
        result = prime * result + ((getSuLastLoginIp() == null) ? 0 : getSuLastLoginIp().hashCode());
        result = prime * result + ((getSuLastLoginTime() == null) ? 0 : getSuLastLoginTime().hashCode());
        result = prime * result + ((getSuStatus() == null) ? 0 : getSuStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", suUsername=").append(suUsername);
        sb.append(", suPassword=").append(suPassword);
        sb.append(", suPasswordSalt=").append(suPasswordSalt);
        sb.append(", suNickname=").append(suNickname);
        sb.append(", suFrom=").append(suFrom);
        sb.append(", suLastLoginIp=").append(suLastLoginIp);
        sb.append(", suLastLoginTime=").append(suLastLoginTime);
        sb.append(", suStatus=").append(suStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}