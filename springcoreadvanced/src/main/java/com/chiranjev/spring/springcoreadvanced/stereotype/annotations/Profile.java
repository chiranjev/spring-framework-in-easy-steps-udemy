package com.chiranjev.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Software Development Engineer")
	private String title;
	@Value("Amazon")
	private String company;
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}
	
	
}
