package com.vilin.springboot.chapter06.service.impl;

import com.vilin.springboot.chapter06.dao.UserDao;
import com.vilin.springboot.chapter06.pojo.User;
import com.vilin.springboot.chapter06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**** imports ****/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao = null;

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1, propagation = Propagation.NESTED)
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
	public User getUser(Long id) {
		return userDao.getUser(id);
	}
}