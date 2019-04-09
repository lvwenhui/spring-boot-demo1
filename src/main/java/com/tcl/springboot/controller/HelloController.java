package com.tcl.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcl.springboot.bean.ConfigDemo;

@RestController
public class HelloController {
    @Autowired
    private ConfigDemo configDemo;


    @RequestMapping("")
    public String hello() {
        return "返回Apollo配置 用户名 ：" + configDemo.getUsername() + "  密码: " + configDemo.getPassword()+"";
    }
}
