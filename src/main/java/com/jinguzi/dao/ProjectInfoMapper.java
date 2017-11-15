package com.jinguzi.dao;

import com.jinguzi.entity.ProjectInfo;
import com.jinguzi.entity.VO.ProjectInfoVO;
import com.jinguzi.utils.PageModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProjectInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectInfo record);

    ProjectInfo selectByPrimaryKey(Long id);

    List<ProjectInfo> selectAll();

    int updateByPrimaryKey(ProjectInfo record);

    List<ProjectInfoVO> selectSelected(ProjectInfo projectInfo);

    Integer countByCondition(ProjectInfo projectInfo);

    List<ProjectInfoVO> getProjectPage(@Param("param")ProjectInfo projectInfo,
                                       @Param("page")PageModel<ProjectInfo> pageModel);
}