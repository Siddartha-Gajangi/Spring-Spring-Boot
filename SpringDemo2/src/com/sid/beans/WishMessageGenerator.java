package com.sid.beans;
import java.time.LocalTime;
import java.time.*;
public class WishMessageGenerator {
private LocalTime time;

public WishMessageGenerator(LocalTime time) {
	
	this.time = time;
}
public String showMessageGenerator() {
	int hour=time.getHour();
	if(hour<12)
		return "Good Morning";
	else if(hour<16)
		return "Good Afternoon";
	else
		return "Good Night..!";
	
}
}
