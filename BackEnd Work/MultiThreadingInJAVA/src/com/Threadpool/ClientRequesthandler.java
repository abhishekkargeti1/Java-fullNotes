package com.Threadpool;

public class ClientRequesthandler implements Runnable {
	
	private final int requestId;
	
	public ClientRequesthandler(int requestId) {
		this.requestId = requestId;
	}
	@Override
	public void run() {
		System.out.println("Processing Request "+requestId+" by"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println("Requested "+ requestId+ "Interrupted");
		}
		System.out.println("Completed Request "+requestId+" by "+ Thread.currentThread().getName());
	}
	
}
