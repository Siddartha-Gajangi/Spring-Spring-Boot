package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DepedencyInjectionTest {
	public static void main(String[] args) {
		//create Ioc container object
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
		Object obj=ctx.getBean("wmg");
		//down casting
	    com.nit.sBeans.WishMessageGenerator generator=(com.nit.sBeans.WishMessageGenerator) obj;
		String msg=generator.showMessageGenerator();
		System.out.println(msg);
		ctx.close();
	}
}