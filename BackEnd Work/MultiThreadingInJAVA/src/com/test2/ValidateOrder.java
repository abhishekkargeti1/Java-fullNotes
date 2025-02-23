package com.test2;

public class ValidateOrder implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Validating Order .. ");
			Thread.sleep(2000);
			System.out.println("Order Validation Completed");
		} catch (Exception e) {
			System.out.println("Order Validation Interrupted");
		}
		
	}

}
