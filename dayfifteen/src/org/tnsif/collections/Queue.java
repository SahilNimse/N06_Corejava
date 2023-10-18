package org.tnsif.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Queue {

	public static void main(String[] args) {
		ArrayDeque<Integer> arr=new ArrayDeque<>();
		arr.add(2);
		arr.addFirst(1);
		arr.addLast(3);
		
		Iterator it=arr.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("Peek : "+arr.peek());
		System.out.println("Peek Last : "+arr.peekLast());
	}

}