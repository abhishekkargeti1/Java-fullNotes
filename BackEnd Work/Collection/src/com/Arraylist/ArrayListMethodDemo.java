package com.Arraylist;

import java.util.ArrayList;

public class ArrayListMethodDemo {

	public static void main(String []args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("List is "+list);
		
		// adding Element
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		System.out.println("List is "+list);
	
		// Adding Element at specific index
		
		list.add(1,"Banana");
		System.out.println("List is "+list);
	
		
		// Accessing Element 
		
		String listElement =list.get(2);
		System.out.println("ListElement "+listElement);
	
		//Modify 
		
		list.set(0, "WaterMelon");
		System.out.println("List is "+list);
		
		// Removing Element
		
		list.remove(1);
		System.out.println("List is "+list);
		
		// Remove By Element
		list.remove("Orange");
		System.out.println("List is "+list);
		
		//Contains
		
		boolean status =list.contains("Apple");
		System.out.println("Status is "+status);
		
		// size 
		int size = list.size();
		System.out.println("Size is "+size);
		
		
		// Iterating on list 
		
		for(String list1:list) {
			System.out.println("List Element is "+list1);
		}
		
		//Clearing the List 
		
		list.clear();
		System.out.println("List is "+list);
		
		
		// Check List is Empty
		
		boolean status1=list.isEmpty();
		System.out.println("List is Empty "+ status1); 
	
		// adding Multiple Element 
		list.add("PineApple");
		list.add("Grapes");
		list.add("Apple");
		System.out.println("List is "+list);
		
		// Cloning the list 
		
		ArrayList<String> clonedList =(ArrayList<String>)list.clone();
		System.out.println("Cloned list "+clonedList );
		
		
		//Index Of Element 
		
		int index = list.indexOf("Apple");
		System.out.println("Index of Element is "+ index);
		
		// Last Index of an Element 
		list.add("strawbeery");
		int lastindex = list.lastIndexOf("strawbeery");
		System.out.println("Last Index of "+lastindex);
	
		//Sublist
		
		ArrayList<String>sublist = new ArrayList<String>(list.subList(1, 2));	
		System.out.println("Sublist is "+sublist);
		
		//Converting to Array 
		
		Object []array = list.toArray();
			System.out.println("Array Element Are");
			
			for(Object obj:array) {
				System.out.println("Object Element are "+obj);
			}
			
		// Adding All Element from Another collection
			
		ArrayList<String> newlist= new ArrayList<String>();
		newlist.add("kiwi");
		newlist.addAll(list);
		System.out.println("New List is "+newlist);
		
		// Retaining Element
		ArrayList<String> retainlist= new ArrayList<String>();
		retainlist.add("kiwi");
		retainlist.add("Grapes");
		newlist.retainAll(retainlist);
			
		System.out.println("Retain All "+retainlist);
		
		newlist.removeAll(retainlist);
		System.out.println("Remove All "+newlist);
	}
	
}
