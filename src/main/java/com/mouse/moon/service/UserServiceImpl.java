package com.mouse.moon.service;

import com.mouse.moon.mapper.UserMapper;
import com.mouse.moon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by wuhao1 on 2016/10/18.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    public User getUserInfoById(String id){
            return userMapper.getUserInfoById(id);
    }

    @PostConstruct
    public void init(){
        System.out.println("12334567575645324532454");
    }

}
