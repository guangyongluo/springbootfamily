package com.vilin.springboot.chapter05.controller;

import com.vilin.springboot.chapter05.pojo.User;
import com.vilin.springboot.chapter05.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**** imports ****/
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
	
	@Autowired
	private MyBatisUserService myBatisUserService = null;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {
		return myBatisUserService.getUser(id);
	}
}