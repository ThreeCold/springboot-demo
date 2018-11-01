package com.rose.demo.common.vo.permission;

import com.rose.demo.common.bas.AbstractVo;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
public class UserVo extends AbstractVo{
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
