package com.ssmbase.basesic.service;

import com.ssmbase.basesic.dao.UserInfoMapper;
import com.ssmbase.basesic.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserInfoMapper userDao;
    public UserInfo selectUsers(){
        UserInfo list = userDao.selectByPrimaryKey(1);
        return list;
    }


}
