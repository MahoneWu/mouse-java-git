package com.mouse.moon.common;

import com.mouse.moon.pojo.User;
import com.mouse.moon.service.UserService;
import com.mouse.moon.service.UserServiceImpl;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/**
 * Created by Mahone Wu on 2017/3/15.
 */
public class ContextListenDemo extends ContextLoaderListener {

    //这种是会报错的
//    @Autowired
//    private UserService userService;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        //必须加这段,会调用初始化的xml进行加载
        super.contextInitialized(event);
        UserService userService = SpringBeanUtils.getBean(UserServiceImpl.class);
        User user = userService.getUserInfoById("1");
        System.out.println(user);
    }
}
