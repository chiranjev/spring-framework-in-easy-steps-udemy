package com.chiranjev.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chiranjev/spring/springcore/assignment/testconfig.xml");
		ShoppingCart shoppingCart = (ShoppingCart)context.getBean("shoppingcart");
		System.out.println(shoppingCart);
	}

}
 