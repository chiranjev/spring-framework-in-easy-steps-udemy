package com.chiranjev.spring.springcore.dependencycheckandscope.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chiranjev/spring/springcore/dependencycheckandscope/assignment/config.xml");
		University university1 = (University)context.getBean("university");
		System.out.println(university1);
		University university2 = (University)context.getBean("university");
		System.out.println(university2);

		System.out.println(university1.hashCode()+" " +university2.hashCode());
	}

}
