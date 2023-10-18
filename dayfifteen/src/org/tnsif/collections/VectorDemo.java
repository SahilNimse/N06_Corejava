package org.tnsif.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vec=new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		
		System.out.println("Capacity : "+ vec.capacity());
		System.out.println("Size : "+vec.size());
		System.out.println(vec.set(0, 5));
		System.out.println(vec);
		
	}

}
