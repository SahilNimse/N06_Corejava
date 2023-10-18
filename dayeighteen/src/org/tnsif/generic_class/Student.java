package org.tnsif.generic_class;

public class Student {
	String name;
	int rn;
	Student(String name,int rn){
		this.name=name;
		this.rn=rn;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rn=" + rn + "]";
	}
	
}
