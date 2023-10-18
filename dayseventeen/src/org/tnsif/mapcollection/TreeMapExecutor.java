package org.tnsif.mapcollection;
import java.util.*;

public class TreeMapExecutor {
//sorting based on keys
	public static void main(String[] args) {

		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("3", "Aizen");
		tm.put("2", "Urahara");
		tm.put("1", "Ichigo");
		
		System.out.println(tm);
	}

}
