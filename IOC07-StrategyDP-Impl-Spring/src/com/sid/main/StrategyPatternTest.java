package com.sid.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sid.conf.AppConfig;
import com.sid.sbeans.Flipkart;

public class StrategyPatternTest {
public static void main(String[] args){
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	Flipkart fpkt=ctx.getBean("fpkt", Flipkart.class);
	String msg=fpkt.Shopping(new String[] {"Saree","Kurtha"}, new double[] {1200,200});
	System.out.println(msg);
	ctx.close();
}
}
