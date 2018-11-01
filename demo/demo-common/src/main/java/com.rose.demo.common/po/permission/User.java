package com.rose.demo.common.po.permission;

import com.rose.demo.common.bas.AbstractPo;

/**
 * 登录用户
 * Created by BG331163 on 2018/10/31.
 * Version 1.0.1
 */
public class User extends AbstractPo {

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
