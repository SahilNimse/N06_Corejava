package org.tnsif.mapcollection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//thread safe and synchronized\
public class HashTableExecutor {

	public static void main(String[] args) {
		Hashtable<String,String> hs=new Hashtable<>();
		hs.put("ai", "Aizen");
		hs.put("Ura", "Urahara");
		hs.put("ichi", "Ichigo");
		hs.put("chi", "yoruichi");
		System.out.println("Contain Aizen : "+hs.contains("Aizen"));
		System.out.println("Contain ark key : "+hs.containsKey("ai"));
		System.out.println("Contain Urahara value : "+hs.containsValue("Ura"));
		hs.remove("ark");
//		hs.remove("ark", "Ashutosh");
		hs.replace("ichci", "Ichigo", "Kurosaki");
		
		System.out.println("Get: "+ hs.get("Ura"));
		
		
		System.out.println("---------------------------------->");
		System.out.println("Enumeration elements :");
		Enumeration<String> em=hs.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		System.out.println();
		System.out.println("Enumeration  :");
		Enumeration<String> em1=hs.keys();
		while(em1.hasMoreElements()) {
			String k=em1.nextElement();
			System.out.println(k+" : "+ hs.get(k));
		}
		
		System.out.println("---------------------------");
		System.out.println("EntrySet: ");
		System.out.println();
		Set<Entry<String,String>> s=hs.entrySet();
		Iterator<Entry<String,String>> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
