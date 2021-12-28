package com.chiranjev.spring.springcore.set;

import java.util.Set;

// this class is also called as pojo
public class CarDealer {

	private String name;
	private Set<String> models;
	
	public Set<String> getModels() {
		return models;
	}
	
	public void setModels(Set<String> models) {
		this.models = models;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
