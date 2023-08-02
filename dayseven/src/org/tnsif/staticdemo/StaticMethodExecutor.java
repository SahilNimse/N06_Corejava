package org.tnsif.staticdemo;

public class StaticMethodExecutor {
	
	static String str="BKC";
	static float percentage=78.9f;
	//static method
	static void displayScore(int score)
	{
		System.out.println(percentage);
		/*we can"t use non static variable inside static method*/
		//system.out.println(str);
		System.out.println(str);
		System.out.println("score is:"+score);
	}

	public static void main(String[] args) {
		displayScore(56);
		

	}

}
