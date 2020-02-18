package com.vilin.springboot.chapter06.dao;

import com.vilin.springboot.chapter06.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUser(Long id);
    int insertUser(User user);
}