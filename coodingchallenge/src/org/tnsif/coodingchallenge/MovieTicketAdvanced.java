package org.tnsif.coodingchallenge;
import java.util.Scanner;
public class MovieTicketAdvanced {
	
	static void ticket(int age, float time)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER THE  YOUR CURRENT AGE :");
		age = sc.nextInt();
		            
		System.out.println("the show timing are");
		System.out.println("a)10.15\nb)13.30\nc)18.00\nd)22.00\n");
		        
		System.out.print("ENTER THE SHOW TIME: ");
		time = sc.nextFloat();

		if(time<=12.00 )
		{
			if(age>=13)
		{
				System.out.println("the adult ticket price is $8");
		}
			else
		{
				System.out.println("the  children ticket price is $4");
		}
		}

		else if(time>12.00 && time<17.00)
		{
			if(age>=13)
		{
				System.out.println("the adult ticket price is $5");
		}
			else
		{
				System.out.println("the children ticket price is $2");
		}

		}

		else
		{
			if(age>=13)
		{
				System.out.println("the adult ticket price is $8");
		}
			else
		{
				System.out.println("the child ticket price is $4");
		}
		}
		}

		

	}

