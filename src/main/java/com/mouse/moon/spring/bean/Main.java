package com.mouse.moon.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Mahone Wu on 2017/3/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/test/spring.xml");
        Man man = (Man)context.getBean("man");
        System.out.println(man);
    }
}
