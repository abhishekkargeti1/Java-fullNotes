package com.Synchro;

public class Customer implements Runnable {

	
	private BankAccount  account;
	private int withdrawalAmount;
	private String name;
	
	
	
	public Customer(BankAccount account, int withdrawalAmount, String name) {
		super();
		this.account = account;
		this.withdrawalAmount = withdrawalAmount;
		this.name = name;
	}



	@Override
	public void run() {
		account.withDraw(withdrawalAmount, name);
		
	}
	
}
