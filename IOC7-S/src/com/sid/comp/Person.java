package com.sid.comp;

public class Person {

	IEngine engine=null;
	
	public void setEngine(IEngine engine) {
		System.out.println("Person is using "+engine);
	}
}
