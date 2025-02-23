package com.Synchro;

public class BankAccount {
	
	private int balance =1000;
	
	public synchronized void withDraw(int amount,String name) {
			System.out.println(name+" is trying to withdraw "+amount);
			if(balance>=amount) {
				System.out.println(name+" is completing the withdrawal...");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				balance -= amount;
				System.out.println(name+" has successfully withdrawn "+amount);
			}else {
				System.out.println(name+" Can't withdrawal due to insufficent  "+amount);				
			}
			System.out.println("Remaining Balance :"+ balance);
	}
	
}	
