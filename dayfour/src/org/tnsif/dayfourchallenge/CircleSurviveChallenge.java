/* // there n people standing in a circle waiting to be executed.
the counting out begins at some point in the circle and proceeds 
around the circle inn  a fix direction in each step a certain no of 
people skipped and the next person is executed. the elimination proceeds 
around the circle in the (which is becoming smaller and smaller as the 
executed people are removed),until only the last person remains,who is 
given freedom.total no of person 'N' and a no K which indicates that K-1 
person are skipped and the Kth person is killed in a circle.the task is 
to choose a person in the initial person that survives.*/
package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {
	 static int survive(int n, int k)
		{
			if(n==1)
				return 1;
			else 
				return (survive(n-1,k)+k-1)%n+1;
		}
		public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER THE VALUE FOR N AND K");
		 int n =sc.nextInt();
		 int k =sc.nextInt();
		 System.out.println(survive(n,k));
		 
			
		}

	}


