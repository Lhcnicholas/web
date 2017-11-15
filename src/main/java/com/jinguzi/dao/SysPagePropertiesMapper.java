package com.jinguzi.dao;

import com.jinguzi.entity.SysPageProperties;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysPagePropertiesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPageProperties record);

    SysPageProperties selectByPrimaryKey(Long id);

    List<SysPageProperties> selectAll();

    int updateByPrimaryKey(SysPageProperties record);

    List<SysPageProperties> selectByCode(SysPageProperties sysPageProperties);
}