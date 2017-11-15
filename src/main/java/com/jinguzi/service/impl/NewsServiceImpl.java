package com.jinguzi.service.impl;

import com.github.pagehelper.PageInfo;
import com.jinguzi.dao.NewsMapper;
import com.jinguzi.entity.News;
import com.jinguzi.service.NewsService;
import com.jinguzi.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhc19
 * @des
 * @date 2017-11-11
 **/
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> getNewsList(News news) {
        return newsMapper.getNewsList(news);
    }

    @Override
    public PageModel<News> getNewsPage(PageModel<News> pageModel) {

        pageModel.setModel(newsMapper.getNewsPage(pageModel));
        return pageModel;
    }

    @Override
    public void insertNews(News news) {
        newsMapper.insert(news);
    }

    @Override
    public void updateNews(News news) {
        newsMapper.updateByPrimaryKey(news);
    }

    @Override
    public void deleteNews(News news) throws Exception {
        if (news.getId() != null){
            newsMapper.deleteByPrimaryKey(news.getId());
        }else {
            throw new Exception("新闻Id为空");
        }

    }

    @Override
    public News getNews(News news) throws Exception {
        if (news.getId() != null){
            return newsMapper.selectByPrimaryKey(news.getId());
        }else {
            throw new Exception("newsId is null");
        }
    }
}
