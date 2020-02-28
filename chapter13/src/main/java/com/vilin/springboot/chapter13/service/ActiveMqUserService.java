package com.vilin.springboot.chapter13.service;

import com.vilin.springboot.chapter13.pojo.User;

public interface ActiveMqUserService {

	public void sendUser(User user);

	public void receiveUser(User user);
}
