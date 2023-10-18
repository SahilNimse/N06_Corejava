package org.tnsif.generic_class;

public class GenericClassDemo {
	public static void main(String[] args) {
		Repo<Integer> objOne=new Repo<Integer>();
		objOne.setData(10);
		System.out.println(objOne.getData());
		
		Repo<String> objTwo=new Repo<String>();
		objTwo.setData("Java");
		System.out.println(objTwo.getData());
		
		Repo<Object> objThree=new Repo<Object>();
		objThree.setData(new Student("Aizen",10));
		System.out.println(objThree.getData());
		
		
	
	}
}
