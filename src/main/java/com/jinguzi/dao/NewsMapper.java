package com.jinguzi.dao;

import com.jinguzi.entity.News;
import com.jinguzi.utils.PageModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NewsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(News record);

    News selectByPrimaryKey(Long id);

    List<News> selectAll();

    int updateByPrimaryKey(News record);

    List<News> getNewsList(News news);

    List<News> getNewsPage(PageModel<News> pageModel);

    Integer countNews(Map<String,Object> condition);
}