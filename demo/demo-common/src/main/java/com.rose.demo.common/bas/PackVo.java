package com.rose.demo.common.bas;

import java.util.List;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
public class PackVo<T> {
    private T row;

    private List<T> rows;

    private Long totalCount;

    public T getRow() {
        return row;
    }

    public void setRow(T row) {
        this.row = row;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
