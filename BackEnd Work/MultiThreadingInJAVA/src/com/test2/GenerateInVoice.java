package com.test2;

public class GenerateInVoice implements Runnable  {

	@Override
	public void run() {
		try {
			System.out.println("Processing Invoice");
			Thread.sleep(2000);
			System.out.println("Invoice Processing Completed");
		} catch (Exception e) {
			System.out.println("Invoice Process Interrupted");

			
		}
		
	}

}
