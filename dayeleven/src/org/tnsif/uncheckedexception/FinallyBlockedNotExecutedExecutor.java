package org.tnsif.uncheckedexception;

public class FinallyBlockedNotExecutedExecutor {
	static void display(int arr[])
	{
		try {
			System.out.println(arr[3]);
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
			System.exit(0);
		}
		finally
		{
			/*when finally block contains an exception code, the 
			 * finally block does not execute*/
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement out of the block is always executed ");
	}

	public static void main(String[] args) {
		int arr[]= {77,5,34,19};
		display(arr);

	}

}
