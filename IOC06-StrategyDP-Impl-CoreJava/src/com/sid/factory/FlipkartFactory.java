package com.sid.factory;

import com.sid.comp.BlueDart;
import com.sid.comp.DTDC;
import com.sid.comp.Flipkart;
import com.sid.comp.ICourier;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) 
	{
		ICourier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("bluedart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("invalid counter type");
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
