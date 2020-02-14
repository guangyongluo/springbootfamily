package com.vilin.springboot.other.pojo;

import com.vilin.springboot.chapter03.pojo.definition.Animal;

public class Squirrel implements Animal {

	@Override
	public void use() {
		System.out.println("松鼠可以采集松果");
	}

}
