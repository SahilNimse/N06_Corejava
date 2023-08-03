package org.tnsif.staticdemo;

public class StaticBlockExecutor {
	
	String str;
	static float salary;
/* static block is used to initiate static variable and we can't
initialize any non static variable inside the static block*/
	
	static {
		salary=67689.86f;
		//str ="BKC";
	}
	static void print()
	{
		System.out.println(salary);
	}

	public static void main(String[] args) {
		print();
		

	}

}
