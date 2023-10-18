package org.tnsif.collections;

//program to demonstrate heterogeneous list
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Executor  {

	public static void main(String[] args)   {
		
//		List a=new ArrayList(); raw list
		@SuppressWarnings("rawtypes")
		List a=new ArrayList();
		
		a.add(1);
		a.add(1.4);
		a.add("Ashutosh");
		a.add('a');
		a.add(true);
		a.add(new Date());
		
		
		System.out.println(a);

		
	}

	

	

}
