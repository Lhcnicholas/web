package com.jinguzi.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Des:
 * Date:2017/11/1
 * Author:LiNic
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") != null){
            logger.info("-------------Access Success!------------");
            return true;
        }else {
            request.getRequestDispatcher("/WEB-INF/jsp/admin/login.jsp").forward(request,response);
            logger.info("-------------Access Failed!--------------");
            return false;
        }
    }
}
