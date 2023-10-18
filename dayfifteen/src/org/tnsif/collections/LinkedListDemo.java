package org.tnsif.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
	
		System.out.println(ll);
		
		System.out.println("Add first and last : ");
		ll.addFirst(1);
		ll.addLast(7);
		System.out.println(ll);
		
		System.out.println("Remove first and last : ");
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		System.out.println("First: "+ll.getFirst()+" Last: "+ ll.getLast());
		
		System.out.println("Iterator:");
		
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
			
		}
		System.out.println();
		System.out.print("List Iterator :"+" ");
		System.out.println();
		ListIterator<Integer> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		//dont need to go last then use previous,can go previous directly using this
		 li=ll.listIterator(ll.size());
		 System.out.println();
			while(li.hasPrevious()) {
				System.out.print(li.previous()+" ");
			}
	}

}