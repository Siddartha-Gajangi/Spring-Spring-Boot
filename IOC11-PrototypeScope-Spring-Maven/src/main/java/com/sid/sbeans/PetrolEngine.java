package com.sid.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public final class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}


	public void startEngine() {
		System.out.println("Petrol Engine Started....");
	}
	public void endEngine() {
		System.out.println("Petrol Engine Stopped....");
	}
}
