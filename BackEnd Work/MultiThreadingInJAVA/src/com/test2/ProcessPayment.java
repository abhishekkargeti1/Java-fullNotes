package com.test2;

public class ProcessPayment implements Runnable {

	@Override
	public void run() {
		
		try {
			System.out.println("Processing Payment");
			Thread.sleep(4000);
			System.out.println("Payment Processing Completed");
		} catch (Exception e) {
			System.out.println("Payment Process Interrupted");

		}
		
	}

}
