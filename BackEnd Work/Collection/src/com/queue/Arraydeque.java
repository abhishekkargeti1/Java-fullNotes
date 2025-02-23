package com.queue;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		
		ArrayDeque<String> deque = new ArrayDeque<String>();
		
		deque.add("Abhishek");
		deque.add("Abhishek Kargeti");
		deque.add("Abhi");
		deque.add("Vinay");
		deque.add("Divesh");
		deque.add("Gurdeep");
		System.out.println("After Add() "+deque);
		
		deque.offerFirst("First");
		System.out.println("First Element "+deque);
		
		deque.offerLast("Last Element");
		System.out.println("last Element "+deque);
		
		System.out.println("First Element "+deque.peekFirst());
		System.out.println("Last Element "+deque.peekLast());
		
		deque.pollFirst();
		System.out.println("After poll First "+deque);
		
		deque.pollLast();
		System.out.println("After poll last "+deque);
		
		deque.push("Pushed element");
		System.out.println("After Push() "+deque);
		
		
	}

}
