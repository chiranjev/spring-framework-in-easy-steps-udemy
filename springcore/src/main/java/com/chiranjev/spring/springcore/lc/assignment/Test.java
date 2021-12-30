package com.chiranjev.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/chiranjev/spring/springcore/lc/assignment/assignmentconfig.xml");
		TicketReservation ticketReservation = (TicketReservation)context.getBean("ticketreservation");
		context.registerShutdownHook(); // it tells the spring container to invoke destroy() lifecycle method.
		System.out.println(ticketReservation);
		
	}
	

}
 