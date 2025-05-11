package com.sid.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sid.beans.WishMessageGenerator;

public class DependencyInjection {
public static void main(String[] args) {
	
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/sid/conf/applicationContext.xml");
	Object obj=ctx.getBean("wmg");
	WishMessageGenerator generator =(WishMessageGenerator)obj;
	String msg=generator.showMessageGenerator();
	System.out.println(msg);
	ctx.close();
	                               
}
}
