package com.vilin.springboot.chapter04.aspect.validator;

import com.vilin.springboot.chapter04.pojo.User;

public interface UserValidator {
	
	public boolean validate(User user);
}
