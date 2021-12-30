package com.chiranjev.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setId() setter method");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception { // init() lifecycle method
		System.out.println("Inside afterPropertiesSet() init lifecycle method in interfaces package");
	}
	

	@Override
	public void destroy() { // destroy() lifecycle method
		System.out.println("Inside destroy() lifecycle method in interfaces package");
	}

}
