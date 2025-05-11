package com.sid.main;

import com.sid.singleton.Printer;

public class SingleTonTest {

	public static void main(String[] args) {
		
		Printer pr1= Printer.getInstance();
		Printer pr2= Printer.getInstance();
		Printer pr3= Printer.getInstance();
		
		System.out.println("Object 1: "+pr1.hashCode());
		System.out.println("Object 2: "+pr2.hashCode());
		System.out.println("Object 3: "+pr3.hashCode());
	}

}
