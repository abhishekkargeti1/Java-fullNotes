package com.Synchro;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Thread customer1 = new Thread(new Customer(account, 500, "Abhishek"));
		Thread customer2 = new Thread(new Customer(account, 700, "Simran"));
		Thread customer3 = new Thread(new Customer(account, 500, "Aditya"));
			customer1.start();
			customer2.start();
			customer3.start();
	}

}
