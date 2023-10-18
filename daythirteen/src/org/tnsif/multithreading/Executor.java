package org.tnsif.multithreading;

public class Executor {
	public static void main(String[] args) {
		ChildThread threadOne=new ChildThread();
		ChildThread threadTwo=new ChildThread();
		System.out.println("Is "+threadOne.currentThread().getName()+" is Alive?: "+threadOne.currentThread().isAlive());
		System.out.println("Is "+threadTwo.currentThread().getName()+" is Alive?: "+threadTwo.currentThread().isAlive());
		
		
	}
}
