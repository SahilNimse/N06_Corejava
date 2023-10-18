package org.tnsif.treeset;

import java.util.*;

public class TreeSetExecutor {
	public static void main(String[] args) {
		System.out.println("1.Add");
		System.out.println("2.Display");
		System.out.println("3.Exit");
		Scanner sc = new Scanner(System.in);

		Products p = new Products();
		int choice = 0;
		while (choice != 3) {
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			System.out.println("---------------------->");
			switch (choice) {
			case 1:
				String s;
				System.out.println("Enter the product");
				s = sc.next();
				p.addProductToList(s);
				System.out.println("---------------------->");
				break;
			case 2:
				p.sortProductList();
				break;
			case 3:
				System.out.println("Thank you for using the application");
				System.out.println("---------------------->");
				break;
			default:
				System.out.println("Wrong input! Try Again..");
				System.out.println("---------------------->");
				break;
			}
		}

	}
}