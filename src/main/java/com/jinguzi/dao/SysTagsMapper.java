package com.jinguzi.dao;

import com.jinguzi.entity.SysTags;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysTagsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysTags record);

    SysTags selectByPrimaryKey(Long id);

    List<SysTags> selectAll();

    int updateByPrimaryKey(SysTags record);
}