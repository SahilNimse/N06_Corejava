package org.tnsif.uncheckedexception;
//program to demonstrate on catch block with multiple exception class
public class CatchBlockDemo {
	
	static void print(int arr[])
	{
		try {
			System.out.println(arr[13]);
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
		}
	}

	public static void main(String[] args) {
		int arr[]= {13,14,8};
		print(arr);
	}

}
