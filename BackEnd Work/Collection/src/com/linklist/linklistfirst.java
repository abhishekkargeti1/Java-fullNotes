package com.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class linklistfirst {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Affter aadding Elements "+list);
		
		list.addFirst(2);
		System.out.println("Affter adding in first  Elements "+list);

		list.addLast(590);
		System.out.println("Affter adding in last  Elements "+list);
		
		list.removeFirst();
		System.out.println("After removing in first  Elements "+list);
		
		list.removeLast();
		System.out.println("After removing in last  Elements "+list);
		
		list.remove(1);
		System.out.println("After removing  Elements "+list);
		
		
		System.out.println("first Element "+list.getFirst());
		System.out.println("last Element "+list.getLast());
		
		list.add(1,35);
		System.out.println("After adding 25 at index 1 "+list);
		
		list.set(0, 15);
		System.out.println("After setting 15 at index 0 "+list);
		
		System.out.println("contains 15? "+list.contains(15));
		System.out.println("contains 15: "+list.indexOf(15));
		
		
		list.push(50);
		System.out.println("After push "+list);
		
		System.out.println("pop element "+list.pop());
		
		System.out.println("After pop "+list);
		
		list.clear();
		System.out.println("After clear "+list);
		
		
		list.add(1548);
		list.add(158);
		list.add(154);
		System.out.println("Queue Mode "+list);
		
		System.out.println("Poll Element :"+list.poll());
		
		System.out.println("After poll "+list);
		
		System.out.println("Peak element "+list.peek());
		
			Iterator<Integer> di = list.descendingIterator();
			di.forEachRemaining(new Consumer<Integer>() {

				@Override
				public void accept(Integer t) {
					System.out.println(t);
				}
				
			});
	}

}
