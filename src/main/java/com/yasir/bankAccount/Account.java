package com.yasir.bankAccount;

public class Account {
	
	private double balance;

	public Account (double balance) {
		
		this.balance = balance;
	}
	public Account() {
		
	}
	public Account(Customer mockCustomer) {
		
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double ammount) {
		
		balance = balance + ammount;
	}
	
	public void withdraw(double ammount) {
		
		balance = balance - ammount;
	}

}
