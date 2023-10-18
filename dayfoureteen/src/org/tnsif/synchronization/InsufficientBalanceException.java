package org.tnsif.synchronization;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Can't withdraw...insufficient balance");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
	
}