package org.tnsif.multithreading;

public class ChildThreadTwo extends Thread{
	public void run()
	{
		System.out.println(" is 5 Prime number? "+Operations.isprime(5));
	}
}
