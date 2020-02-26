package com.vilin.springboot.chapter12.dao;

import com.vilin.springboot.chapter12.pojo.DatabaseUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
	
	public DatabaseUser getUser(String userName);
}
