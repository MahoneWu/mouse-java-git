package com.mouse.moon.mapper;

import com.mouse.moon.pojo.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

        int insertUser(User user);

        User getUserInfoById(String id);

}