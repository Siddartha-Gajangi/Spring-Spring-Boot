package com.sid.main;

import com.sid.Factory.PersonFactory;
import com.sid.comp.Person;

public class User {
public static void main(String[] args) {
	
	Person p= PersonFactory.getInstance("bike");
	p.setEngine("bike");
	
}
}
