package org.tnsif.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

/*program to demonstrate on array using run-time input vales and to
find largest element in an array*/
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total no. of array elements");
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element is: "+max);
		Arrays.sort(arr);
		System.out.println("Sorted element are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}

	}

}
