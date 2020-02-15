package com.vilin.springboot.chapter04.aspect.service;


import com.vilin.springboot.chapter04.pojo.User;

public interface UserService {
	
	public void printUser();

	public void printUser(User user);
	
	
	public void manyAspects();
}
