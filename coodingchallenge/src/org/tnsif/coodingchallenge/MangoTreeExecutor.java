/*Darshan is so much interested in gardening and hence he plants more 
trees in his garden. he plant trees in rectangular garden with rows 
and columns and numbers the tree in row wise order. he planted the 
mango tree in the first row first column and last column. so given 
the tree number and row(r) and column(t) number your task is to check 
whether the tree is mango tree or not.
*/

package org.tnsif.coodingchallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<n)
			System.out.println("Mango Tree");
		else
			System.out.println("Not a mango tree");
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		
		
	}

}
