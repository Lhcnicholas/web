package com.jinguzi.utils;

import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

/**
 * @author lhc19
 * @des
 * @date 2017-11-11
 **/
public class PageModel<T> {

    private Integer pageNo=1;
    private Integer pageSize=10;
    private Integer offset=0;
    private Integer total;

    private List<T> model;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        this.offset = (this.pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        this.offset = (this.pageNo-1)*this.pageSize;
    }

    public List<T> getModel() {
        return model;
    }

    public void setModel(List<T> model) {
        this.model = model;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOffset() {
        return offset;
    }
}
