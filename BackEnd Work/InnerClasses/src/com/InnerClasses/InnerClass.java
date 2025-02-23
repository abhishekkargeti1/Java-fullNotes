package com.InnerClasses;

public class InnerClass {
	
	private int data = 100;

	class inner {
		void show() {
			System.out.println("Value is "+data);
		}
	}
	public static void main(String []args) {
		
		/*
		 * InnerClass i = new InnerClass(); inner i1 = i.new inner(); i1.show();
		 */
		
		InnerClass.inner  i1 = new InnerClass().new inner();
		i1.show();
	}
	
}
