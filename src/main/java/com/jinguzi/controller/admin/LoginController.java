package com.jinguzi.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * Des:登录
 * Author:LiNic
 * Date:2017/10/31
 */
@Controller
@RequestMapping("/admin/login")
public class LoginController {


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView loginPage(){
        return new ModelAndView("admin/login");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (Objects.equals(username, "admin") && Objects.equals(password, "admin")){
            Cookie cookie =new Cookie("name","admin");
            response.addCookie(cookie);
            return new ModelAndView("redirect:/");
        }
        else return new ModelAndView("admin/login");
    }
}
