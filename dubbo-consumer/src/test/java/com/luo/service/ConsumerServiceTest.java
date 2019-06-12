package com.luo.service;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		TestService testService = (TestService) context.getBean("testService");
		String name = testService.getName();
		System.out.println("========:"+name);

	}

}
