package com.StaticInnerClass;

public class StaticInnerclass {
	
	
	static int data = 100;
	
	static class inner{
		static void fun() {
			System.out.println("Value is "+data);
		}
	}
	public static void main(String []args) {
		StaticInnerclass.inner.fun();
	}
}
