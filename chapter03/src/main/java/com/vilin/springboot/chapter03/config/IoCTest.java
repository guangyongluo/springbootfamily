package com.vilin.springboot.chapter03.config;

import java.sql.SQLException;

import com.vilin.springboot.chapter03.pojo.BussinessPerson;
import com.vilin.springboot.chapter03.pojo.User;
import com.vilin.springboot.chapter03.pojo.definition.Person;
import com.vilin.springboot.other.pojo.Squirrel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {
	private static Logger logger = LoggerFactory.getLogger(IoCTest.class);

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		Squirrel squirrel = ctx.getBean(Squirrel.class);
//		squirrel.use();
//        User user = (User)ctx.getBean("user");
//		logger.info(String.valueOf(user));
		Person person = ctx.getBean(BussinessPerson.class);
		person.service();
		ctx.registerShutdownHook();
	}
}
