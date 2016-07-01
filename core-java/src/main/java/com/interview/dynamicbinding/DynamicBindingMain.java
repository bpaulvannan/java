package com.interview.dynamicbinding;

/**
 * 1. Child Constructor Calls Parent Constructor 
 * 2. Parent Constructor Calls Object Constructor
 * 3. Parent static block executes
 * 4. Child static block executes
 * 5. Parent init block executes
 * 6. Parent constructor executes
 * 7. Child init block executes
 * 8. Child constructor executes
 */
public class DynamicBindingMain {
	public static void main(String[] args){
		new Child();
	}
}
