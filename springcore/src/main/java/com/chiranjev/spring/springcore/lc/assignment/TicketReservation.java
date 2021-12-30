package com.chiranjev.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setId() setter method");
		this.id = id;
	}

	@PostConstruct
	public void init() { // init lifecycle method
		System.out.println("Inside init Method in assignment package");
	}
	
	@PreDestroy
	public void destroy() { // destroy lifecycle method
		System.out.println("Inside destroy Method in assignment package");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
