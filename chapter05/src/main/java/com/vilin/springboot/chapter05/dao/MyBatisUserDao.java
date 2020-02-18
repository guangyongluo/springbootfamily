package com.vilin.springboot.chapter05.dao;

import com.vilin.springboot.chapter05.pojo.User;
import org.springframework.stereotype.Repository;

/**** imports ****/
@Repository
public interface MyBatisUserDao {
	public User getUser(Long id);
}