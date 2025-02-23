package com.test;

public class TestClass2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello World");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String []args) {
			TestClass2 tc2 = new TestClass2();
			Thread t = new Thread(tc2,"Abhi");
			t.start();
			System.out.println(Thread.currentThread().getName());

	}
		
}
