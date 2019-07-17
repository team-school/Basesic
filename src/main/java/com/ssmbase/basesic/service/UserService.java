package com.ssmbase.basesic.service;

import com.ssmbase.basesic.dao.UserDto;
import com.ssmbase.basesic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDto userDao;
    public List<User> selectUsers(){
        List<User> list = userDao.getUser();
        return list;
    }

    public void insertUser(User user){
      int a=  userDao.insert(user);
    }

}
