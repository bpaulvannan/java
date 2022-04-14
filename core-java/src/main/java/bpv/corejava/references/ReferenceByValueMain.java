package bpv.corejava.references;

public class ReferenceByValueMain {
	public static void main(String[] args){
		int index = 5;
		int capacity = 10; 

		ReferenceHolder refHolder = new ReferenceHolder(capacity);
		System.out.println("data = " + refHolder.getData(index));
		
		refHolder.setNullAfterFetch(index);
		System.out.println("data after setNullAfterFetch = " + refHolder.getData(index));
		
		refHolder.setNullDirect(index);
		System.out.println("data after setNullDirect = " + refHolder.getData(index));
		
		DataObject dataToNullify = new DataObject(101);
		refHolder.nullifyObject(dataToNullify);
		System.out.println("data after nullifyObject = " + dataToNullify);
		
	}
}
