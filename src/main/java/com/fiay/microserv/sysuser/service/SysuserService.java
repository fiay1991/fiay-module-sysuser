package com.fiay.microserv.sysuser.service;

import com.fiay.microserv.sysuser.dao.SysuserDao;
import com.fiay.microserv.sysuser.model.Sysuser;
import com.fiay.microserv.sysuser.model.SysuserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.List;

/**
 * 系统用户 服务类
 * Created by Fiay on 2018/2/27.
 */
@Service("sysuserService")
public class SysuserService {

    @Autowired
    private SysuserDao sysuserDao;

    /**
     * 添加新用户
     * @param suUsername 用户名
     * @param suPassword 密码明文
     * @param suNickname 昵称
     * @return
     */
    @Transactional
    public Integer addSU(String suUsername,String suPassword,String suNickname) {
        Sysuser sysuser = new Sysuser();
        sysuser.setSuUsername(suUsername);
        sysuser.setSuPassword(suPassword);
        sysuser.setSuPasswordSalt("salt");
        sysuser.setSuFrom(1);
        sysuser.setSuStatus(1);
        sysuser.setSuNickname(suNickname);
        sysuser.setSuLastLoginIp("0.0.0.0");
        sysuser.setSuLastLoginTime(Calendar.getInstance().getTime());
        return sysuserDao.insertSelective(sysuser);
    }

    /**
     * 修改用户密码
     * @param username
     * @param oldPassword
     * @param newPassword
     * @return
     */
    public Integer editSUPassword(String username,String oldPassword,String newPassword){
        SysuserExample example = new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        criteria.andSuUsernameEqualTo(username);
        criteria.andSuPasswordEqualTo(oldPassword);
        Sysuser sysuser = new Sysuser();
        sysuser.setSuPassword(newPassword);
        return sysuserDao.updateByExampleSelective(sysuser,example);
    }

    /**
     * 修改昵称
     * @param username
     * @param password
     * @param nickname
     * @return
     */
    public Integer editSUNickname(String username,String password,String nickname){
        SysuserExample example = new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        criteria.andSuUsernameEqualTo(username);
        criteria.andSuPasswordEqualTo(password);
        Sysuser sysuser = new Sysuser();
        sysuser.setSuNickname(nickname);
        return sysuserDao.updateByExampleSelective(sysuser,example);
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public Sysuser userLogin(String username,String password){
        SysuserExample example = new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        criteria.andSuUsernameEqualTo(username);
        criteria.andSuPasswordEqualTo(password);
        List<Sysuser> list = sysuserDao.selectByExample(example);
        return list.size()==1?list.get(0):null;
    }

}
