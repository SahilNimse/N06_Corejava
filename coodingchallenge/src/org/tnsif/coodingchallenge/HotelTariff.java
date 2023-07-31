package org.tnsif.coodingchallenge;
import java.util.Scanner;
public class HotelTariff {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER THE MONTH : ");
			int month = sc.nextInt();
			
			System.out.println("ENTER THE DAYS : ");
			int days = sc.nextInt();
			
			System.out.println("ENTER THE RENT : ");
			float rent = sc.nextInt();
			
			switch(month) {
			case 1:
			case 2:
			case 3:
			case 7:
			case 8:
			case 9:
				System.out.println("the rent is "+(rent*days));
				break;
				
			case 4:
			case 5:
			case 6:
			case 10:
			case 11:
			case 12:
				System.out.println("the rent is "+(rent+(rent*0.2f))*days);
				break;
				
				default:
					System.out.println("enter the valid month ");
					break;
				

			
			}
			

		}



	}

