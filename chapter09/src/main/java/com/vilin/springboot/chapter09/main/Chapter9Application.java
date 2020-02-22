package com.vilin.springboot.chapter09.main;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vilin.springboot.chapter09")
@MapperScan(basePackages="com.vilin.springboot.chapter09", annotationClass = Mapper.class)
public class Chapter9Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter9Application.class, args);
	}
}
