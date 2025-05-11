package com.sid.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart{

	private ICourier courier;
	
	public void setCourier(ICourier courier) {
		this.courier=courier;
	}
	
	public String Shopping(String items[],double prices[]) {
		double billAmt=0;
		for(double p : prices) {
			billAmt=billAmt+p;
		}
		int oid=new Random().nextInt(1000);
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+" items with bill Amount: "+billAmt+"---"+msg;
	}
}
