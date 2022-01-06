package com.chiranjev.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	Addition(Double a, Double b){
		System.out.println("Inside constructor Double");
	}
	
	Addition(int a, int b){
		System.out.println("Inside constructor INT");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}

	Addition(String a, String b){
		System.out.println("Inside constructor String");
	}

}
