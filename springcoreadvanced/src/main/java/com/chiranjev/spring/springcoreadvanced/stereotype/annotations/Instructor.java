package com.chiranjev.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	
	@Value("10")
	private int id;
	
	@Value("Chiranjev Koul")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}
	
	
	

}
