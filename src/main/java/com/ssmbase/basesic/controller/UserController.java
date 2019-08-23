package com.ssmbase.basesic.controller;


import com.ssmbase.basesic.BasesicApplication;
import com.ssmbase.basesic.config.ResultResponse;
import com.ssmbase.basesic.model.UserInfo;
import com.ssmbase.basesic.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@EnableAutoConfiguration
@Api(value = "用户Controller", description = "用户Controller")
public class UserController {
    private static Logger log =LogManager.getLogger(BasesicApplication.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ApiOperation(value = "获取单个用户信息", notes = "根据User中Id获取用户信息")
    public ResultResponse<UserInfo> selectUsersById(){
        log.info("查询用户");
        return ResultResponse.createBySuccess(userService.selectUsers());
    }


}