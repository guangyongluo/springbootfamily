package com.vilin.springboot.chapter05.service.impl;

import com.vilin.springboot.chapter05.dao.MyBatisUserDao;
import com.vilin.springboot.chapter05.pojo.User;
import com.vilin.springboot.chapter05.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**** imports ****/
@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {
    @Autowired
    private MyBatisUserDao myBatisUserDao = null;
    
    @Override
    public User getUser(Long id) {
        return myBatisUserDao.getUser(id);
    }
}