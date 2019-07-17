package com.ssmbase.basesic.controller;


import com.ssmbase.basesic.config.ResultResponse;
import com.ssmbase.basesic.model.User;
import com.ssmbase.basesic.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
@EnableAutoConfiguration
@Api(value = "用户Controller", description = "用户Controller")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ApiOperation(value = "获取单个用户信息", notes = "根据User中Id获取用户信息")
    public ResultResponse<User> selectUsersById(){
        return ResultResponse.createBySuccess(userService.selectUsers());
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增用户", notes = "新增用户")
    public void insertUser(User user){
        userService.insertUser(user);
    }
}