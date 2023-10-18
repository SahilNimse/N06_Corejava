package org.tnsif.multithreading;

public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {
//		traditional way-using implementable class of 
		RunnableImp1 imp1 = new RunnableImp1();
		Thread threadOne = new Thread(imp1);
		threadOne.start();
		Thread.sleep(100);
//		2nd way-using anonymous class
		Runnable obj = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Anonymous Function " + Thread.currentThread().getName());
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

//		lambda expression
		Runnable objOne = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Lambda Expression " + Thread.currentThread().getName());
			}
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread threadtwo = new Thread(obj);
		Thread threadthree = new Thread(objOne);
		threadtwo.run();
		threadthree.run();
	}

}
