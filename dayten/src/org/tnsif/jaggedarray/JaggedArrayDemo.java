package org.tnsif.jaggedarray;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [3][];
		// declaration of jagged array
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();		
			}
		}
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("the number stored in arr["+i+"]["+j+"]= "+arr[i][j]+" ");
			}
			
			System.out.print("\n");
		}
	
	}

}
		
/*given an array numbers of n int where n>1 return an array output 
 * such that output of i index = product of all elements of numbers 
 * except numbers of i index
 * 
 * input[1,2,3,4]
 * output[24,12,8,6]*/	

	


