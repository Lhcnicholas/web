package com.jinguzi.service;

import com.jinguzi.entity.SysPageProperties;

import java.util.List;

/**
 * @author lhc19
 * @des
 * @date 2017-11-12
 **/
public interface PropertyService {

    /** 为页面获取属性
     * @param pageCode
     * @return
     */
    List<SysPageProperties> getPropertiesForPage(String pageCode);
}
