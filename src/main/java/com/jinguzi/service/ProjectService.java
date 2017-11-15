package com.jinguzi.service;

import com.jinguzi.entity.ProjectInfo;
import com.jinguzi.entity.VO.ProjectInfoVO;
import com.jinguzi.utils.PageModel;

import java.util.List;

/**
 * @author lhc19
 * @des
 * @date 2017-11-13
 **/
public interface ProjectService {

    ProjectInfo getProjectInfo(ProjectInfo projectInfo);

    List<ProjectInfoVO> getProjectList(ProjectInfo projectInfo);

    PageModel<ProjectInfoVO> getProjectPage(ProjectInfo param,PageModel<ProjectInfo> pageModel);
}
