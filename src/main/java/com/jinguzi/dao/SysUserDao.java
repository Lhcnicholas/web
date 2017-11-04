package com.jinguzi.dao;

import com.jinguzi.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * Des:
 * Date:2017/11/1
 * Author:LiNic
 */
@Repository
public interface SysUserDao {

    SysUser selectUserInfo(SysUser sysUser);
}
