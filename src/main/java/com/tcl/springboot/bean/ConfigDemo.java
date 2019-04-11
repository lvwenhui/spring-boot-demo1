package com.tcl.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/**
 * 配置类
 *
 * @author ThinkTik
 */


@Component
@EnableApolloConfig(value = "config_demo")
public class ConfigDemo {
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    public ConfigDemo() {}

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
