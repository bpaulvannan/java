package bpv.corejava.string;

public class StringComparison {
	public static void main(String[] args){
		
		//Hellow World is pulled  from String object pool.
		String helloWorld = "Hello World";
		
		//So == will return true
		System.out.println(" pool: using == " + ( helloWorld == "Hello World") );
		
		//Create new instance of String object
		String helloWorldObj = new String("Hello World");
		//So == will return false
		System.out.println(" obj : using == " + ( helloWorld == helloWorldObj) );
		
		//.equals() comapares the values so returns true
		System.out.println(" using .equals() " + helloWorldObj.equals(helloWorld));
		
		//assert helloWorld == null : "hellWorld is not null -> " + helloWorld;
	}
}
