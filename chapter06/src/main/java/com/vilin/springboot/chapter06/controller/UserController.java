package com.vilin.springboot.chapter06.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vilin.springboot.chapter06.pojo.User;
import com.vilin.springboot.chapter06.service.UserBatchService;
import com.vilin.springboot.chapter06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**** imports ****/
@Controller
@RequestMapping("/user")
public class UserController {
	// 注入Service
	@Autowired
	private UserService userService = null;

	@Autowired
	private UserBatchService userBatchService = null ;

	// 测试获取用户
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {
		return userService.getUser(id);
	}

	// 测试插入用户
	@RequestMapping("/insertUser")
	@ResponseBody
	public Map<String, Object> insertUser(String userName, String note) {
		User user = new User();
		user.setUserName(userName);
		user.setNote(note);
		// 结果会回填主键，返回插入条数
		int update = userService.insertUser(user);
		Map<String, Object> result = new HashMap<>();
		result.put("success", update == 1);
		result.put("user", user);
		return result;
	}

	@RequestMapping("/insertUsers")
	@ResponseBody
	public Map<String, Object> insertUsers(String userName1, String note1, String userName2 , String note2) {
		User userl =new User ();
		userl . setUserName(userName1) ;
		userl.setNote(note1) ;
		User user2 =new User();
		user2 . setUserName(userName2);
		user2 . setNote (note2);
		List<User> userList = new ArrayList<>();
		userList.add(userl);
		userList.add(user2) ;
        //结果会回填主键，返回插入条数
		int inserts= userBatchService .insertUsers(userList) ;
		Map<String, Object> result = new HashMap<> ();
		result.put ("success", inserts>0) ;
		result.put ("user", userList);
		return result;
	}
}