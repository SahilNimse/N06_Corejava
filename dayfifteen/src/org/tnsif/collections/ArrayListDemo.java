package org.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> arr=new ArrayList<>();
		arr.add(0);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2,4);
		arr.remove(2); //removes 4 which is at index 2
		System.out.println("Size of arr : "+arr.size());
		
		System.out.println("Does it contain 2 : "+arr.contains(2));
		System.out.println(arr);
		System.out.println("Does 400  present in it ? : "+arr.indexOf(400));
		arr.remove(arr.indexOf(1));
		Collections.sort(arr);
		System.out.println("-------After Sorting--------");
		System.out.println(arr);
		

		Collections.reverse(arr);
		System.out.println("-------After reversing------");
		System.out.println(arr);
		
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext()) {

			System.out.print(it.next()%2==0?"Even ":"Odd ");
		}
		System.out.println();
		arr.clear();
		System.out.println("is it empty : "+arr.isEmpty());
		
		System.out.println("Iterator -------------");
		
		
	}

}
