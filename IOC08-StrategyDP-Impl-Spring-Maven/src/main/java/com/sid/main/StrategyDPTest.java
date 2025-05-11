package com.sid.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sid.config.AppConfig;
import com.sid.sbeans.Vehicle;


public class StrategyDPTest 
{
	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
	
	vehicle.journey("hyd","goa");
	ctx.close();
	}
	
}
