package com.sid.main;

import com.sid.comp.Flipkart;
import com.sid.factory.FlipkartFactory;

public class StrategyPatternTest {
public static void main(String[] args){
	
	Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
	String resultMsg=fpkt.Shopping(new String[] {"shirt","trusers"},new double[] {3809,456});
	System.out.println(resultMsg);
}
}
