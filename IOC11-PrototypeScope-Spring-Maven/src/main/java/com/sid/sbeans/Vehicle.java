package com.sid.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public void journey(String startPlace,String endPlace) {
		engine.startEngine();
		System.out.println("Journey Started from "+startPlace);
		
		System.out.println("Journey is Going on.....");
	
		
		System.out.println("Journey Ended at "+endPlace);
	}
}
