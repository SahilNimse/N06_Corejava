package org.tnsif.collections;

import java.util.PriorityQueue;

public class PriorityQueueExecutor {

	public static void main(String[] args) {
		PriorityQueue<Integer> arr=new PriorityQueue<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		System.out.println(arr.peek());
		
	}

}
