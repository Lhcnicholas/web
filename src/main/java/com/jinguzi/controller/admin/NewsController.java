package com.jinguzi.controller.admin;

import com.jinguzi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lhc19
 * @des 新闻管理控制器
 * @date 2017-11-11
 **/
@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;
}
