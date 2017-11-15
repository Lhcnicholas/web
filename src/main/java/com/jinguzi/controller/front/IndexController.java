package com.jinguzi.controller.front;


import com.jinguzi.entity.ProjectInfo;
import com.jinguzi.entity.SysPageProperties;
import com.jinguzi.service.ProjectService;
import com.jinguzi.service.PropertyService;
import com.jinguzi.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("")
public class IndexController {

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private ProjectService projectService;

    public static final String INDEX_PAGE = "index";

    @RequestMapping(value = {"","index"})
    public ModelAndView index(HttpServletRequest request){
        //List<SysPageProperties> indexProperties = propertyService.getPropertiesForPage(INDEX_PAGE);
        ModelAndView index = new ModelAndView("front/index");
        //index.addObject("properties",indexProperties);
//        PageModel<ProjectInfo> pageModel = new PageModel<>();
//        pageModel.setPageNo(1);
//        pageModel.setPageSize(3);
//        pageModel = projectService.getProjectPage(pageModel);
        //List<ProjectInfo> projects = projectService.getProjectList(new ProjectInfo());
        //index.addObject("projects",projects);
        return index;
    }

    @RequestMapping(value = "about")
    public ModelAndView about(){
        return new ModelAndView("front/about");
    }

    @RequestMapping(value = "project")
    public ModelAndView projects(){
        return new ModelAndView("front/project/index");
    }

    @RequestMapping(value = "newAccount")
    public ModelAndView newAccount(){
        return new ModelAndView("front/newAccount");
    }

    @RequestMapping(value = "investHelp")
    public ModelAndView investHelp(){
        return new ModelAndView("front/investHelp");
    }

    @RequestMapping(value = "contact")
    public ModelAndView contact(){
        return new ModelAndView("front/contactUs");
    }
}
