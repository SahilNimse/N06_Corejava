package org.tnsif.synchronization;

public interface Bank {
	public static final int DEPOSIT_LIMIT = 25000;
	static final int MINIMUM_BALANCE = 1000;

	void deposit(int amount) throws DepositLimitExceedsException;
	int DEPOSIT_LIMIT1 = 25000;
	static final int MINIMUM_BALANCE1 = 1000;

	void deposit1(int amount) throws DepositLimitExceedsException;

	public abstract void withdraw(int amount) throws InsufficientBalanceException;
}
