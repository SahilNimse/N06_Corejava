package org.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;

public class UserDefinedDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> studentlist=new ArrayList<>();
		studentlist.add(new Student("Sahil",1,80));
		studentlist.add(new Student("Devansh",2,75));
		studentlist.add(new Student("Shivam",3,50));
		studentlist.add(new Student("Viabhav",4,27));
		
		System.out.println(studentlist);
		Collections.sort(studentlist);
		System.out.println("After Sorting : ");
		System.out.println(studentlist);

	}

}
