package org.tnsif.looping;

import java.util.Scanner;

public class WhileStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		//Printing num to 1
		while(num>=1)
		{
			System.out.println(num+" ");
			num--;
		}

	}

}
