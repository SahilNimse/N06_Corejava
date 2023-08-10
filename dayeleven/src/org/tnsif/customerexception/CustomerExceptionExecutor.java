package org.tnsif.customerexception;
import java.util.Scanner;
public class CustomerExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String userid=s.nextLine();
		String password=s.nextLine();
		
		try {
		if(userid.equals("roronoazoro@03gmail.com") &&
				password.equals("pass@321"))
		{
			System.out.println("Credentials are matched!! \nYou are the greatest swordman in \nthe One world");
		}
		else
		{
			throw new LoginCredentials("\nBastard!! \nYou are one of the Marines");
		}

	}
	catch(LoginCredentials e)
	{
		System.out.println("Exception handled: "+e);
	}

}
}
