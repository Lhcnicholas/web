package com.jinguzi.controller.admin;

import com.jinguzi.entity.SysUser;
import com.jinguzi.service.SysUserService;
import com.jinguzi.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Des:登录
 * Author:LiNic
 * Date:2017/10/31
 */
@Controller
@RequestMapping("/admin/login")
public class LoginController {


    @Autowired
    private SysUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView loginPage(){
        return new ModelAndView("admin/login");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        SysUser userParam = new SysUser();
        userParam.setName(username);
        SysUser user = userService.getUser(userParam);
        if (user != null){
            if (Objects.equals(username, user.getName()) && Objects.equals(password, user.getPassword())){
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                session.setMaxInactiveInterval(60);
                return new ModelAndView("redirect:/admin");
            }
            return new ModelAndView("admin/login");
        }

        else return new ModelAndView("admin/login");
    }
}
