package com.sid.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public final class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	public void startEngine() {
		System.out.println("Diesel Engine Started....");
	}
	public void endEngine() {
		System.out.println("Diesel Engine Stopped....");
	}
}
