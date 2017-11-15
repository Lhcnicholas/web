package com.jinguzi.service.impl;

import com.jinguzi.dao.ProjectInfoMapper;
import com.jinguzi.entity.ProjectInfo;
import com.jinguzi.entity.VO.ProjectInfoVO;
import com.jinguzi.service.ProjectService;
import com.jinguzi.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhc19
 * @des
 * @date 2017-11-13
 **/
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectInfoMapper projectInfoMapper;

    @Override
    public ProjectInfo getProjectInfo(ProjectInfo projectInfo) {
        return projectInfoMapper.selectByPrimaryKey(projectInfo.getId());
    }

    @Override
    public List<ProjectInfoVO> getProjectList(ProjectInfo projectInfo) {
        return projectInfoMapper.selectSelected(projectInfo);
    }

    @Override
    public PageModel<ProjectInfoVO> getProjectPage(ProjectInfo param,PageModel<ProjectInfo> pageModel) {
        PageModel<ProjectInfoVO> result = new PageModel<>();
        result.setPageNo(pageModel.getPageNo());
        result.setPageSize(pageModel.getPageSize());
        Integer total = projectInfoMapper.countByCondition(param);
        result.setTotal(total);
        result.setModel(projectInfoMapper.getProjectPage(param,pageModel));
        return result;
    }
}
