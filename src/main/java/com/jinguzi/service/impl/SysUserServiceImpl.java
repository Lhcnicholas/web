package com.jinguzi.service.impl;

import com.jinguzi.dao.SysUserDao;
import com.jinguzi.entity.SysUser;
import com.jinguzi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Des:
 * Date:2017/11/1
 * Author:LiNic
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser getUser(SysUser sysUser) {
        return sysUserDao.selectUserInfo(sysUser);
    }
}
