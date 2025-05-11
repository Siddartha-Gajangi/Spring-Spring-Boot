package com.sid.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("pEngine")
	private IEngine engine;
	
	public void journey(String startPlace,String endPlace) 
	{
		engine.startEngine();
		System.out.println("Journey Started from "+startPlace);
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Journey is Going on.....");
		
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Journey Ended at "+endPlace);
	}
}