package com.mouse.moon.controller;

import com.mouse.moon.pojo.EngineBean;
import com.mouse.moon.pojo.ParamBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mahone Wu on 2016/7/19.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/index")
    public String toTest(){
        return "test";
    }



    @RequestMapping(value = "/test")
    public void toTests(@ModelAttribute EngineBean paramBean){
        System.out.println(paramBean);
        System.out.println("123");
    }
}
