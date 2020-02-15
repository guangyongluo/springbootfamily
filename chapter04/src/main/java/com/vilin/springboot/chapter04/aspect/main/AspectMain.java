package com.vilin.springboot.chapter04.aspect.main;

import com.vilin.springboot.chapter04.aspect.config.AspectConfig;
import com.vilin.springboot.chapter04.aspect.service.UserService;
import com.vilin.springboot.chapter04.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		User user = new User();
		user.setId(1L);
		user.setUsername("user_name_1");
		user.setNote("note_1");
		userService.printUser(user);
		System.out.println("********************************");
		user = null;
		userService.printUser(user);
	}
}
