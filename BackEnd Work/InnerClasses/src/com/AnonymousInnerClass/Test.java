package com.AnonymousInnerClass;

abstract class Test1{
	abstract void show();
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1 = new Test1() {
			
			@Override
			void show() {
				System.out.println("Hello World");
			}
		};
		t1.show();
	}

}
