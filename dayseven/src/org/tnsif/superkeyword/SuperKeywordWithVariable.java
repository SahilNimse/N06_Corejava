package org.tnsif.superkeyword;
//program to demonstrate on super keyword with variable
class building
{
	int floors=23;
	String name="Jajdambha";
}
class flat extends building{
	String name="Sahil Nimse";
	
	void print()
	{
		/*if parent class and child class variable name are same, and
		 if you want to access parent class variable inside child
		 class, use super variable name*/
		System.out.println(super.name);
		System.out.println(name);
		
	}
	
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		flat f=new flat();
		f.print();
		

	}

}
