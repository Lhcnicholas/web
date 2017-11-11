package com.jinguzi.utils;

/**
 * @author lhc19
 * @des
 * @date 2017-11-11
 **/
public class PageModel<T> {

    private Integer pageNo;
    private Integer pageSize;
    private T model;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
