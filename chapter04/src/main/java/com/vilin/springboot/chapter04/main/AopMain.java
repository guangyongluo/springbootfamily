package com.vilin.springboot.chapter04.main;

import com.vilin.springboot.chapter04.service.impl.HelloServiceImpl;
import com.vilin.springboot.chapter04.intercept.MyInterceptor;
import com.vilin.springboot.chapter04.proxy.ProxyBean;
import com.vilin.springboot.chapter04.service.HelloService;

public class AopMain {

	public static void main(String[] args) {
		testProxy();
	}
	
	private static void testProxy() {
		HelloService helloService = new HelloServiceImpl();
		HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
		proxy.sayHello("zhangsan");
		System.out.println("\n###############name is null!!#############\n");
		proxy.sayHello(null);
	}

}
