package com.test2;

public class OrderProcessingSystem {

	public static void main(String[] args) {
		
		Thread validateOrder = new Thread(new ValidateOrder());
		Thread checkInventory = new Thread(new CheckInvertory());
		Thread processpayment = new Thread(new ProcessPayment());
		Thread generateInvoice = new Thread(new GenerateInVoice());
		
		
		validateOrder.start();
		checkInventory.start();
		processpayment.start();
		generateInvoice.start();
		
		try {
			validateOrder.join();
			checkInventory.join();
			processpayment.join();
			generateInvoice.join();
		} catch (Exception e) {
			System.out.println("Order Processing Interrupted");
		}
		
		System.out.println("Order Process Succesfully . Confirmaion Sent to Customer");
	}

}
