package org.tnsif.coodingchallenge;

import java.util.Arrays;

public class JavaAnagram {

	public static void main(String[] args) {
		String a="act";
		String b="cat";
		a.replaceAll("\\s", "");
		b.replaceAll("\\s", "");
		 char[] ArrayS1 = a.toLowerCase().toCharArray();  
         char[] ArrayS2 = b.toLowerCase().toCharArray();  
         Arrays.sort(ArrayS1);  
         Arrays.sort(ArrayS2); 
         boolean flag=Arrays.equals(ArrayS1, ArrayS2);
         System.out.println(flag);
	}

}
