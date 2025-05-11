package com.sid.main;

import java.util.Arrays;

import com.sid.comp.Demo;

public class ClassOperationsTest {
public static void main(String[] args) {
	
	Class c1=Demo.class;
	System.out.println("c1 class name :"+c1.getClass());
	System.out.println("c1 obj data :"+c1.toString());
	System.out.println("Demo class details are: ");
	System.out.println("Super class name :"+c1.getSuperclass());
	System.out.println("List of implemented interfaces in Demo class :"+Arrays.toString(c1.getInterfaces()));
	System.out.println("List of methods in Demo class :"+Arrays.toString(c1.getDeclaredMethods()));
	System.out.println("List of Fields in Demo class :"+Arrays.toString(c1.getDeclaredFields()));
	System.out.println("List of constructors in Demo class :"+Arrays.toString(c1.getDeclaredConstructors()));
	
}
}
