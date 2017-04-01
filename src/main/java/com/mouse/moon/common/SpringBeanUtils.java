package com.mouse.moon.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Mahone Wu on 2017/3/14.
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

    /**获取上线文对象*/
    private static ApplicationContext  applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
    }


    public static ApplicationContext getApplicationContext(){
        return  applicationContext;
    }

    /**
     * 获取某个bean
     * @param name
     * @param <T>
     * @return
     */
    public static <T> T getBean(String name){
        return (T)applicationContext.getBean(name);
    }

    /**
     * 根据类型获取bean
     * @param clz
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class clz){
        return  (T)applicationContext.getBean(clz);
    }
}
