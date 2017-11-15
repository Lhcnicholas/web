package com.jinguzi.service;

import com.jinguzi.entity.News;
import com.jinguzi.utils.PageModel;

import java.util.List;

/**
 * @author lhc19
 * @des
 * @date 2017-11-11
 **/
public interface NewsService {

    List<News> getNewsList(News news);

    PageModel<News> getNewsPage(PageModel<News> pageModel);

    void insertNews(News news);

    void updateNews(News news);

    void deleteNews(News news) throws Exception;

    News getNews(News news) throws Exception;
}
