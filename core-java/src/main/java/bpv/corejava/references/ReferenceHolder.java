package bpv.corejava.references;

public class ReferenceHolder {
	private DataObject[] dataHolderArr;
	public ReferenceHolder(int capacity){
		dataHolderArr = new DataObject[capacity];
		for(int i=0; i < capacity; i++){
			dataHolderArr[i] = new DataObject(i);
		}
	}
	public DataObject getData(int i){
		if(i >= 0 && i <= dataHolderArr.length){
			return dataHolderArr[i];
		}
		return null;
	}
	
	/**
	 * When data is fetched from array, the reference is passed as value
	 * So setting it to null, will not remove the reference from array
	 * @param i
	 */
	public void setNullAfterFetch(int i){
		if(i >= 0 && i <= dataHolderArr.length){
			DataObject data = dataHolderArr[i];
			data = null;
		}
	}
	
	/**
	 * When null is assigned directly in array, the reference is set as null
	 * @param i
	 */
	public void setNullDirect(int i){
		if(i >= 0 && i <= dataHolderArr.length){
			dataHolderArr[i] = null;
		}
	}
	
	/**
	 * Object reference is passed by value.
	 * Setting it to null will not make the orginal object reference as null
	 * @param objToNullify
	 */
	public void nullifyObject(Object objToNullify){
		objToNullify = null;
	}
}
