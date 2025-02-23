package com.stack;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("Python");
		stack.push("Javascript");
		System.out.println("Stack After push "+stack);
		
		String popelement=stack.pop();
		System.out.println("Pooped Element "+popelement);
		System.out.println("Stack After pop Element "+stack);
		
		
		String topElement = stack.peek();
		System.out.println("Top Element "+topElement);
		
		
		boolean empty =stack.empty();
		System.out.println("Stack is empty "+empty);
		
		
		int position = stack.search("Java");
		System.out.println("Position of Java "+position);
		
	}

}
