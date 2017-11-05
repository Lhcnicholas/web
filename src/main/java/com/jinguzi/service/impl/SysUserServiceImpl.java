package com.jinguzi.service.impl;

import com.jinguzi.dao.SysUserMapper;
import com.jinguzi.entity.SysUser;
import com.jinguzi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Des:
 * Date:2017/11/1
 * Author:LiNic
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getUser(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }
}
