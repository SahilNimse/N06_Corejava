package org.tnsif.mapcollection;
	import java.util.*;
	import java.util.Map.Entry;
	public class HashMapExecutor {

		public static void main(String[] args) {
			
			HashMap<String,String> hm=new HashMap<>();
			hm.put(null, "Ashutosh");
			hm.put("1", null);
			//can put null values and faster
	 
			System.out.println(hm);
			System.out.println("----------------------------");
			Set<Entry<String,String>> s=hm.entrySet();
			Iterator<Entry<String,String>> it=s.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}
