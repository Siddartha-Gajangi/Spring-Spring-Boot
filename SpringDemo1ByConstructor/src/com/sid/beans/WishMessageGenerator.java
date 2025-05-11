package com.sid.beans;

import java.time.*;

public class WishMessageGenerator {
private LocalTime time;
private LocalDate date;

public WishMessageGenerator(LocalTime time,LocalDate date) {
	this.time=time;
	this.date=date;
	System.out.println("WishMessageGenerator::2-arg contructor");
}
	
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()::"+time+"..."+date);
		int hour = time.getHour();
		if(hour<12)
			return "Good Morning: "+user;
		else if(hour<16)
			return "Good Afternoon: "+user;
		else if(hour<18)
			return "Good Evening: "+user;
		else
			return "Good Night: "+user;
	
}
}
