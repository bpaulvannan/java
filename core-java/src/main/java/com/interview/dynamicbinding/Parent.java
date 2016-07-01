package com.interview.dynamicbinding;

public class Parent {
	//Static block executes first
	static {
		System.out.println("Parent Static Block");
	}

	//Init Block Executes second
	{
		System.out.println("Parent Init Block");
	}

	//Constructor Executes third
	public Parent() {
		//Calls Object.super()
		System.out.println("Parent Constructor Block");
	}
}


