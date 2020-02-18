package com.vilin.springboot.chapter06.service;

import com.vilin.springboot.chapter06.pojo.User;

import java.util.List;

public interface UserBatchService {

    // 新增用户
    public int insertUsers(List<User> userList);
}
