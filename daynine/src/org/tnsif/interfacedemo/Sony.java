package org.tnsif.interfacedemo;

public interface Sony {
/*by default all the variable inside an interface is public static
final*/
	int noOfchannels=8;
/* by default all the method inside an interface is an abstract 
method*/
	void display() ;
	static void accept()
	{
		System.out.println("Static Method");
		}
	//default method
	default void show()
	{
		System.out.println("Default Method");
	}

}
