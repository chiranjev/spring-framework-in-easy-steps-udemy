package com.chiranjev.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setId() setter method");
		this.id = id;
	}
	
	public void init() { // init lifecycle method
		System.out.println("Inside init Method in xmlconfig package");
	}
	
	public void destroy() { // destroy lifecycle method
		System.out.println("Inside destroy Method in xmlconfig package");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
