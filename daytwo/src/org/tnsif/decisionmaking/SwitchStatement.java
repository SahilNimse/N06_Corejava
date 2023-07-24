package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Song umber");
		int songno=s.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("Take Me To The Church");
				break;
			case 2:
				System.out.println("Hold On");
				break;
			default:
				System.out.println("Invalid Input");
		}

	}

}
