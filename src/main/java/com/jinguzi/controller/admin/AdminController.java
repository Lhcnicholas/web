package com.jinguzi.controller.admin;

import com.jinguzi.utils.CommonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping
    public ModelAndView admin(HttpServletRequest request){
        String ip = CommonUtils.getRemoteHost(request);
        ModelAndView modelAndView = new ModelAndView("admin/index");
        modelAndView.addObject("ip",ip);
        return modelAndView;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(HttpServletRequest request){
        return "Hello World!";
    }
}
