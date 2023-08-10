package org.tnsif.customerexception;
import java.io.FileInputStream;
public class CheckExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\sahil nimse\\eclipse-workspace\\dayeleven");
			System.out.println("file is exist");
		}
		catch(Exception e) {
			System.out.println("Exception handled: "+e);
			

		}

	}
	}
