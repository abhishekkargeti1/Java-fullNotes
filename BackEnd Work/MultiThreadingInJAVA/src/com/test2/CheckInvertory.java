package com.test2;

public class CheckInvertory implements Runnable {

	@Override
	public void run() {
		
		try {
			System.out.println("Checking Inventory ");
			Thread.sleep(3000);
			System.out.println("Inventory Check Completed");
		} catch (Exception e) {
			System.out.println("Inventory Check Interrupted");

		}
	}
	
}
