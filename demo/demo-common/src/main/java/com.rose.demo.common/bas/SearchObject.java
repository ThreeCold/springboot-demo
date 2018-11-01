package com.rose.demo.common.bas;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
public class SearchObject {
    private int pageNo;

    private int pageSize;

    private String orderBy;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
