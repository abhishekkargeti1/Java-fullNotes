package com.test;

public class TestClass3 extends Thread {
		
	private String msg;
	public TestClass3(String msg) {
		super(msg);
	}
	@Override
	public void run() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		TestClass3 tc3 = new TestClass3("Abhis");
		tc3.start();

	}

}
