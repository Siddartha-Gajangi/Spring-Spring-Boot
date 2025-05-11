package com.sid.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sid.config.AppConfig;
import com.sid.sbeans.Vehicle;
import com.sid.singleton.Printer;

public class StrategyDPTest 
{
	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
	
	vehicle.journey("hyd","goa");
	
	System.out.println("--------------------------");
	Printer prn1=ctx.getBean("prn",Printer.class);
	Printer prn2=ctx.getBean("prn",Printer.class);
	
	System.out.println(prn1.hashCode()+" "+prn2.hashCode());
	
	ctx.close();
	}
	
}
