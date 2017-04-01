package com.mouse.moon.spring.bean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Created by Mahone Wu on 2017/3/17.
 */
public class Man implements InitializingBean {


    private WoMan woMan;

    public Man(){
        System.out.println("初始化  man");
    }

    public void setWoMan(WoMan woMan){
        System.out.println("setWoMan");
        this.woMan = woMan;
    }

    public void init(){
        System.out.println("init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }


}
