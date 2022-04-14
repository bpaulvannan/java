package bpv.corejava.nullobj;

public class ValidAccessUsingNullObjectMain {
	private static final int ID = 1;
	public static void main(String[] args) {
		
		ValidAccessUsingNullObjectMain nullObject = null;
		System.out.println( "ID = " + nullObject.ID);
	}

}
