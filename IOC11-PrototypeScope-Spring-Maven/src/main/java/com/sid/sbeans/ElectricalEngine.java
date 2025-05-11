package com.sid.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public final class ElectricalEngine implements IEngine {
	
	public ElectricalEngine() {
		System.out.println("ElectricalEngine.ElectricalEngine()");
	}


	public void startEngine() {
		System.out.println("Electrical Engine Started....");
	}
	public void endEngine() {
		System.out.println("Electrical Engine Stopped....");
	}
}
