package com.sid.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sid.beans.MessageGenerator;

public class MainClass {
public static void main(String[] args) {
	
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/sid/conf/applicationContext.xml");
	Object obj=ctx.getBean("wmg");
	MessageGenerator generator=(MessageGenerator)obj;
	String msg=generator.showMessageGenerator();
	System.out.println(msg);
	ctx.close();
}
}
