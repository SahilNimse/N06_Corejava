package org.tnsif.uncheckedexception;

public class ArrayIndexOutofBoundExecptionExecutor {
	
	static void display(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement out of the block is always executed ");
	}

	public static void main(String[] args) {
		int arr[]= {12,15,14,11};
		display(arr);

	}

}
