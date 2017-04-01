package com.mouse.moon.controller;

import com.mouse.moon.pojo.EngineBean;
import com.mouse.moon.pojo.ParamBean;
import com.mouse.moon.pojo.User;
import com.mouse.moon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mahone Wu on 2016/7/19.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String toTest(){
        return "test";
    }



    @RequestMapping(value = "/test")
    public void toTests(@ModelAttribute EngineBean paramBean){
        System.out.println(paramBean);
        System.out.println("123");
    }

    @ResponseBody
    @RequestMapping(value = "/userInfo")
    public User test(){
        User user = userService.getUserInfoById("1");
        return  user;
    }


}
