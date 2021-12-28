package com.chiranjev.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chiranjev/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital)context.getBean("hospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
		/*
		 
		 Spring container is created
		 it loads the config file from classpath.
		 It will create instance of Hospital bean.
		 it will inject name property and departments property.
		 
		 */
	}

}
 