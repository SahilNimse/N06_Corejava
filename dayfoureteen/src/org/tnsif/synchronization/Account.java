package org.tnsif.synchronization;

public class Account implements Bank {

	private int accNo;
	private int balance;
	private String name;

	public Account(int accNo, int balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}

	// getters and setters
	private int accNo1;
	private String name1;
	private int balance1;

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public int getBalance1() {
		return balance;
	}

	public void setBalance1(int balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString
	public String toString1() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", name=" + name + ", getAccNo()=" + getAccNo()
				+ ", getBalance()=" + getBalance1() + ", getName()=" + getName() + "]";
	}

	@Override
	public synchronized void deposit(int amount) throws DepositLimitExceedsException {
		if (amount > Bank.DEPOSIT_LIMIT) {
			throw new DepositLimitExceedException();
		balance;
		
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit1(int amount) throws DepositLimitExceedsException {
		if (amount>Bank.DEPOSIT_LIMIT)
			throw new DepositLimitExceedsException("can't deposit "+amount+" as deposit limit exceeded..");
		balance+=amount;
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance - Bank.MINIMUM_BALANCE) {
			throw new InsufficientBalanceException();
		}
		balance -= amount;
		
		if (amount>balance-Bank.MINIMUM_BALANCE)
			throw new InsufficientBalanceException("Can't withdraw, Insufficient balance : "+balance);
		balance-=amount;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
