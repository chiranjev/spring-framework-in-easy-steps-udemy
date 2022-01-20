package com.chiranjev.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chiranjev/spring/springcoreadvanced/injecting/interfaces/config-annotation.xml");
		OrderBO bo = (OrderBO)context.getBean("bo");
		bo.placeOrder();
	}

}
