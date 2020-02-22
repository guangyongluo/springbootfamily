package com.vilin.springboot.chapter09.service;

import com.vilin.springboot.chapter09.pojo.User;

import java.util.List;

public interface UserService {
	
	User getUser(Long id);

	List<User> findUsers(String userName, String note);

}
