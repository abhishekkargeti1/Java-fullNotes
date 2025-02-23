package com.test;

public class TestClass extends Thread {
	
	@Override
	public void run() {
			System.out.println("Hello I am Thread Class");
	}

	public static void main(String []args) {
		TestClass tc = new TestClass();
		tc.start();
	}
}
