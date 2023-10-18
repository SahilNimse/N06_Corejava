package org.tnsif.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println("Capacity : "+s.capacity());
		System.out.println("empty : "+s.empty());
		System.out.println("size : "+s.size());
		s.remove(4);
		System.out.println("size() : "+s.size());
		System.out.println("peek : "+s.peek());
		System.out.println("pop: "+s.pop());
		s.removeAllElements();
		System.out.println("isEmpty : "+s.isEmpty());
	}

}
