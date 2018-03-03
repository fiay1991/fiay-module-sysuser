package com.fiay.microserv.sysuser.util.shiro;

import com.fiay.microserv.sysuser.dao.SysuserDao;
import com.fiay.microserv.sysuser.model.Sysuser;
import com.fiay.microserv.sysuser.model.SysuserExample;
import com.fiay.microserv.sysuser.util.jwt.JWTToken;
import com.fiay.microserv.sysuser.util.jwt.JWTUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义Shiro验证过程
 * Created by Fiay on 2018/3/2.
 */
@Component
public class FMSUShiroRealm extends AuthorizingRealm {

    private static final Logger LOGGER = LogManager.getLogger(FMSUShiroRealm.class);

    @Autowired
    private SysuserDao sysuserDao;

    /**
     * 使用自定义的JWTToken实例
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = JWTUtil.getUsername(principals.toString());
        Sysuser sysuser = getSUByUsername(username);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRole("admin"); // TODO:待修改从数据库获取角色
        Set<String> permission = new HashSet<>(Arrays.asList("view,search")); // TODO:待修改从数据库获取权限
        simpleAuthorizationInfo.addStringPermissions(permission);
        return simpleAuthorizationInfo;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token invalid");
        }

        Sysuser sysuser = getSUByUsername(username);
        if (sysuser == null) {
            throw new AuthenticationException("User didn't existed!");
        }
        if (!JWTUtil.verify(token, username, sysuser.getSuPasswordSalt())) {
            throw new AuthenticationException("Username or password error");
        }

        return new SimpleAuthenticationInfo(token, token, this.getName());
    }

    /**
     * 根据用户名从数据库获取用户信息
     *
     * @param username
     * @return
     */
    protected Sysuser getSUByUsername(String username) {
        SysuserExample example = new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        criteria.andSuUsernameEqualTo(username);
        List<Sysuser> list = sysuserDao.loginByExample(example);
        return list != null && list.size() == 1 ? list.get(0) : null;
    }
}