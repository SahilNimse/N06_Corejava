package org.tnsif.singleinheritence;

	public class SingleInheritenceExecutor{
	    
	    public static void main(String[] args) {
	        Student s1 = new Student();
	        System.out.println(s1);
	        System.out.println();
	        Student s2 = new Student(2, "MET", "Nashik", "Maharashtra", 422101, 123456789012L);
	        System.out.println(s2);
	    }
	}
