package com.sid.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sid.conf.AppConfig;
import com.sid.sbeans.WeekDayFinder;

public class DependencyInjection {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx=
			new AnnotationConfigApplicationContext(AppConfig.class);
	WeekDayFinder finder=(WeekDayFinder)ctx.getBean("wdf");
	String msg=finder.showMessage("Sidd");
	System.out.println(msg);
	ctx.close();
}
}
