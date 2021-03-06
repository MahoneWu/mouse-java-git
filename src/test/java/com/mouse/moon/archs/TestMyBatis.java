package com.mouse.moon.archs;

import com.mouse.moon.common.SpringBeanUtils;
import com.mouse.moon.mapper.UserMapper;
import com.mouse.moon.pojo.User;
import com.mouse.moon.pojo.UserPerson;
import com.mouse.moon.service.UserPersonService;
import com.mouse.moon.service.UserService;
import com.mouse.moon.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.HandlerMapping;

import java.util.Map;

/**
 * Created by wuhao on 16/7/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {


    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TestMyBatis.class);

    @Autowired
    private UserPersonService userPersonService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @Test
    public void testInit(){
        String id = "1421925823694573";
        userService.getUserInfoById(id);
    }

    @Test
    public void testData()
    {
        String id = "1421925823694573";
        UserPerson userPerson = userPersonService.getUserPersonInfoById(id);
        System.out.println(userPerson.getUserName());
    }

    @Test
    public  void testInsert(){
        User user = new User();
        //user.setId(10);
        userMapper.insertUser(user);
        System.out.println(user.getId());
    }

    @Test
    public void testUser(){
        //User user = userService.getUserInfoById("1");
        //UserService userService = SpringBeanUtils.getBean("userService");
        UserService userService = SpringBeanUtils.getBean(UserServiceImpl.class);
        User user = userService.getUserInfoById("1");
        System.out.println(user);
        Map map = BeanFactoryUtils.beansOfTypeIncludingAncestors(SpringBeanUtils.getApplicationContext(), UserService.class, true, false);
        System.out.println(map);
        Map controMap =SpringBeanUtils.getApplicationContext().getBeansWithAnnotation(Controller.class);
        System.out.println(controMap);

    }

}