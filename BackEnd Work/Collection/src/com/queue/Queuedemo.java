package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queuedemo {
	public static void main (String []args) {
		// PriorityQueue
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// Adding Element using add and offer
		pq.add(50);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.offer(50);
		pq.offer(60);
		
		System.out.println("Priority Queue "+pq);
		
		
		// Accessing Element using Peek and Element 
		System.out.println("Peek (head of queue): "+pq.peek());
		System.out.println("Element (head of queue): "+pq.element());
		
		
		//  Removing elements using remove and poll()
		pq.remove(20);
		System.out.println("After removing 20 "+pq);
		
		System.out.println("Poll (remove head ): "+pq.poll());
		System.out.println("After poll "+pq);
		
		// Checking if the element exist using contain.
		
		System.out.println("Contains 15 ? "+pq.contains(15));
		System.out.println("Contains 60 ? "+pq.contains(60));
		
		// Iterating over the priorityQueue using Iterator
		
		System.out.println("Itrating over all element ");
		
		Iterator<Integer> iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//checking the size of the priorityQueue
		System.out.println("Size of the Priority Queue "+pq.size());
		
		//Clear
		pq.clear();
		System.out.println("priority Queue after clear() "+pq);
		
		// Checking if the Priority Queue is empty
		
		System.out.println("Is Priority Queue is empty "+pq.isEmpty());
		
		
	}

}
