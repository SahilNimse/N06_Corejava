package org.tnsif.daysisteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		ls.add(8);
		ls.add(7);
		ls.add(6);
		ls.add(5);
		ArrayList<Integer> arr=new ArrayList<>();
		arr.addAll(ls);
		Collections.sort(arr);
		System.out.println(arr);
		
		System.out.println("---------------------------");
		
		LinkedHashSet<Customer> c1=new LinkedHashSet<>();
		c1.add(new Customer("Ichigo","Nashik"));
		c1.add(new Customer("Aizen","Malegaon"));
		c1.add(new Customer("Yamamoto","Shirdi"));
		c1.add(new Customer("Urahara","Dindori"));
		
		System.out.println(c1);
		
		ArrayList<Customer> arr1=new ArrayList<>();
		arr1.addAll(c1);
		
		Comparator<Customer> comp=(s1,s2)->{
			return s1.getCity().compareTo(s2.getCity());
		};
		Collections.sort(arr1,comp);
		System.out.println(arr1);
		
		
	}
}
