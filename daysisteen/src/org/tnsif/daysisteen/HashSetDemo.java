package org.tnsif.daysisteen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		HashSet<Integer> hs1=new HashSet<>();
		hs.add(3);
		hs.add(4);
		hs.add(4);
		hs.add(5);
		hs.add(1);
		
		hs1.addAll(hs);
		System.out.println(hs);
		System.out.println(hs1);
		hs1.add(6);
		hs1.add(7);
		hs1.retainAll(hs);
		System.out.println(hs1);
		
//		
//		Iterator it=hs1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
