package com.vilin.springboot.chapter09.service.impl;

import java.util.List;

import com.vilin.springboot.chapter09.dao.UserDao;
import com.vilin.springboot.chapter09.pojo.User;
import com.vilin.springboot.chapter09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao = null;
	
	@Override
	public User getUser(Long id) {
		return userDao.getUser(id);
	}

	@Override
	public List<User> findUsers(String userName, String note) {
		return userDao.findUsers(userName, note);
	}
	
}
