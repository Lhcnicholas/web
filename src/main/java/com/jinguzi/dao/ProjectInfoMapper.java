package com.jinguzi.dao;

import com.jinguzi.entity.ProjectInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectInfo record);

    ProjectInfo selectByPrimaryKey(Long id);

    List<ProjectInfo> selectAll();

    int updateByPrimaryKey(ProjectInfo record);
}