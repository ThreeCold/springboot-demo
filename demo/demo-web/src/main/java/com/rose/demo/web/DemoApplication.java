package com.rose.demo.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.rose.demo"})
@MapperScan("com.rose.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
