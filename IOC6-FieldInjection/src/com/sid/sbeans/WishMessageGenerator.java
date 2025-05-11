package com.sid.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

@Autowired
private LocalTime time;

public WishMessageGenerator() {
	System.out.println("WishMessageGenerator 0-Param Constructor");
}

public show Message(String user) {
	return if()
}
}
