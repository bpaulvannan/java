package com.interview.references;

public class DataObject {
	private final int i;
	public DataObject(int i){
		this.i = i;
	}
	public int getData(){
		return this.i;
	}
	
	@Override
	public String toString() {
		return "DataObject [i=" + i + "]";
	}
}
