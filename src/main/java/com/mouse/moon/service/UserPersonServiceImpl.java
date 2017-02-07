package com.mouse.moon.service;

import com.mouse.moon.mapper.UserPersonMapper;
import com.mouse.moon.pojo.UserPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by wuhao on 16/7/31.
 */
@Service
public class UserPersonServiceImpl implements UserPersonService {


    private final static Logger logger = LoggerFactory.getLogger(UserPersonServiceImpl.class);


    @Autowired
    private UserPersonMapper userPersonMapper;

    public UserPerson getUserPersonInfoById(String id) {
        return userPersonMapper.getUserPersonInfoById(id);
    }

    @PostConstruct
    public void init(){
        System.out.println("test init123");
    }
}
