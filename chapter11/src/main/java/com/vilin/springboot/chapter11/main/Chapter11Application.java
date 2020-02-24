package com.vilin.springboot.chapter11.main;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vilin.springboot.chapter11")
@MapperScan(basePackages = "com.vilin.springboot.chapter11.dao", annotationClass = Mapper.class)
public class Chapter11Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter11Application.class, args);
	}
}
