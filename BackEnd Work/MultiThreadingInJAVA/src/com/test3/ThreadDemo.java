package com.test3;

public class ThreadDemo  {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		t1.setName("Abhishek");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());

	}

}
