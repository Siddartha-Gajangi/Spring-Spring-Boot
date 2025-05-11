package com.sid.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("prn")
public class Printer {

	private static Printer INSTANCE;
	
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
	
	public void printData(String message) {
		System.out.println(message);
	}
}

