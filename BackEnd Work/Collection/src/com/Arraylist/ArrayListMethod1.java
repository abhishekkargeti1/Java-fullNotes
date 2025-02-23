package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayListMethod1 {
	public static void main (String []main) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Kiwi");
		list.add("Orange");
		list.add("Banana");
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		list.forEach(e->System.out.println(e));
		
		 Iterator<String> itr = list.iterator();
		    
		    while (itr.hasNext()) {
		      
		      String s = itr.next();
		      
		      System.out.println(s);
		      
		    }
		    
		    ListIterator<String> listIterator = list.listIterator();
		    
		    while (listIterator.hasNext()) {
		      String string = (String) listIterator.next();
		      System.out.println(string);
		    }
		    
		    System.out.println("===================================");
		    ListIterator<String> listIterator2 = list.listIterator(3);
		    
		    while (listIterator2.hasNext()) {
		      String string = (String) listIterator2.next();
		      System.out.println(string);
		    }
		    
		  
		  }
		
		
			
		
}

