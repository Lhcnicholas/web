package com.jinguzi.service.impl;

import com.jinguzi.dao.SysPagePropertiesMapper;
import com.jinguzi.entity.SysPageProperties;
import com.jinguzi.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhc19
 * @des
 * @date 2017-11-12
 **/
@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private SysPagePropertiesMapper sysPagePropertiesMapper;

    @Override
    public List<SysPageProperties> getPropertiesForPage(String pageCode) {
        SysPageProperties sysPageProperties = new SysPageProperties();
        sysPageProperties.setPageCode(pageCode);
        return sysPagePropertiesMapper.selectByCode(sysPageProperties);
    }
}
