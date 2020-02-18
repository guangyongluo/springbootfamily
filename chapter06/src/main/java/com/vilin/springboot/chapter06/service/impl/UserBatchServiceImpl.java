package com.vilin.springboot.chapter06.service.impl;

import com.vilin.springboot.chapter06.pojo.User;
import com.vilin.springboot.chapter06.service.UserBatchService;
import com.vilin.springboot.chapter06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserBatchServiceImpl implements UserBatchService {
    @Autowired
    private UserService userService = null;

    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED , propagation= Propagation.REQUIRED)
    public int insertUsers(List<User> userList) {
        int count = 0 ;
        for (User user : userList) {
            // 用用子方法，将使用＠ Transactional 定义的传播行
            count+= userService.insertUser(user);
        }
        return count ;
    }
}
