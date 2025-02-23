package com.LocalInnerClass;

public class LocalInnerclass {
	
	void show() {
		class Inner{
			void show() {
				System.out.println("Hello World");
			}
		}
		Inner i1 = new Inner();
		i1.show();
	} 
	public static void main(String []args) {
		LocalInnerclass l1 = new LocalInnerclass();
		l1.show();
	}
	

}
