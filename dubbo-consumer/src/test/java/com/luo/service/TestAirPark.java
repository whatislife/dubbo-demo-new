package com.luo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aipark.park.entity.City;
import com.aipark.park.service.CityService;
import com.alibaba.fastjson.JSON;
//import com.zhht.tob.standard.park.entity.City;
//import com.zhht.tob.standard.park.service.CityService;

public class TestAirPark {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		CityService ser = (CityService) context.getBean("cityService");
		City city = ser.getCityById((long) 1);
		System.out.println(JSON.toJSON(city));
	}

}
