package com.sid.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sid.conf.AppConfig;
import com.sid.sbeans.WeekDayFinder;

public class DepedencyInjection {
public static void main(String[] args) {
	
	System.out.println("DepedencyInjection.main()(start)");
	
	AnnotationConfigApplicationContext ctx=
			new AnnotationConfigApplicationContext(AppConfig.class);
	WeekDayFinder finder = ctx.getBean("wdf",WeekDayFinder.class);
	String result=finder.showMessage("Sid");
	System.out.println(result);
	ctx.close();
}
}
