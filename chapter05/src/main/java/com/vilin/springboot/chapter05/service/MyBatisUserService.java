package com.vilin.springboot.chapter05.service;

import com.vilin.springboot.chapter05.pojo.User;

public interface MyBatisUserService {
    public User getUser(Long id);
}