package com.ssmbase.basesic.service;

import com.ssmbase.basesic.dao.UserMapper;
import com.ssmbase.basesic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userDao;
    public User selectUsers(){
        User list = userDao.selectByPrimaryKey(1);
        return list;
    }

    public void insertUser(User user){
      int a=  userDao.insert(user);
    }

}
