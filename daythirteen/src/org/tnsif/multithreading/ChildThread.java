package org.tnsif.multithreading;

public class ChildThread extends Thread {
	public ChildThread() {
//		
		setPriority(MAX_PRIORITY);
		//start thread Exexcution 
		start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" : Hi");
		System.out.println("Is "+Thread.currentThread().getName()+" : is Alive? "+Thread.currentThread().isAlive());
	}
}
