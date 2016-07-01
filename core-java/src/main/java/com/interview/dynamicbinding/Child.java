package com.interview.dynamicbinding;

public class Child extends Parent {
	//Child static block executes after Parent static block
	static {
		System.out.println("Child Static Block");
	}

	//Child init block executes after Parent constructor block
	{
		System.out.println("Child Init Block");
	}

	//Child constructor exectues after Child init block
	public Child() {
		//Calls super() -> Parent()
		System.out.println("Child Constructor Block");
	}
}