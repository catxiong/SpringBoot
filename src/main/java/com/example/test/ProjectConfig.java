package com.example.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProjectConfig implements InitializingBean {
    @PostConstruct
    public void doBefore() {
        System.out.println("初始化前");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化后");
    }
}
