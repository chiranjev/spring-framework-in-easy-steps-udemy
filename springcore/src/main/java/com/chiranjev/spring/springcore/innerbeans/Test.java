package com.chiranjev.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chiranjev/spring/springcore/innerbeans/config.xml");
		Employee employee1 = (Employee)context.getBean("employee");
		System.out.println(employee1);

		Employee employee2 = (Employee)context.getBean("employee");
		System.out.println(employee2);
		System.out.println(employee1.hashCode()+" " +employee2.hashCode());
	}

}
