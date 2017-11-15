package com.jinguzi.controller.front;

import com.github.pagehelper.Page;
import com.jinguzi.entity.News;
import com.jinguzi.service.NewsService;
import com.jinguzi.service.PropertyService;
import com.jinguzi.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lhc19
 * @des
 * @date 2017-11-12
 **/
@Controller
@RequestMapping("/news")
public class NewsWebController {

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private NewsService newsService;

    @RequestMapping("")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView index = new ModelAndView("front/news/index");

        return index;
    }

    @RequestMapping("detail")
    public ModelAndView detail(HttpServletRequest request){
        ModelAndView detail = new ModelAndView("front/news/detail");

        return detail;
    }

    @RequestMapping("content")
    @ResponseBody
    public News content(@RequestParam(value = "id")Long id) throws Exception {
        News news = new News();
        news.setId(id);
        return newsService.getNews(news);
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView list = new ModelAndView("front/news/list");
        return list;
    }

    @RequestMapping(value = "list",method = RequestMethod.POST)
    @ResponseBody
    public PageModel<News> list(PageModel<News> pageModel){
        return newsService.getNewsPage(pageModel);
    }
}
