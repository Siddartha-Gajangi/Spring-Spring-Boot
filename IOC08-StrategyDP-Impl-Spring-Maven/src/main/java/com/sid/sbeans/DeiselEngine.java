package com.sid.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DeiselEngine implements IEngine

{

	@Override
	public void startEngine() 
	{
		
		System.out.println("DeiselEngine::Diesel Engine started");
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("DeiselEngine::Desiel Engine stopped");
		
	}

}