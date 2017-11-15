package com.jinguzi.controller.front;

import com.jinguzi.entity.ProjectInfo;
import com.jinguzi.entity.VO.ProjectInfoVO;
import com.jinguzi.service.ProjectService;
import com.jinguzi.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lhc19
 * @des
 * @date 2017-11-15
 **/
@Controller
@RequestMapping("project")
public class ProjectWebController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "list",method = RequestMethod.POST)
    @ResponseBody
    public PageModel<ProjectInfoVO> list(ProjectInfo projectInfo, PageModel<ProjectInfo> pageModel){
        return projectService.getProjectPage(projectInfo,pageModel);
    }
}
