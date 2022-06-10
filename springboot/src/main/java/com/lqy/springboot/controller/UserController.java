package com.lqy.springboot.controller;

import com.lqy.springboot.common.Result;
import com.lqy.springboot.entity.User;
import com.lqy.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
//    @RequestBody可以把Json转换为对象

    @Resource
    UserMapper userMapper;

    @PostMapping
    public Result<?> save(@RequestBody User user){
        userMapper.insert(user);
        return Result.success();
    }
}
