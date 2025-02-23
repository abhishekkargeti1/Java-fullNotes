package com.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistclass1 {

	public static void main(String[] args) {
		// default Constructor
		ArrayList<String> defaultList = new ArrayList<String>();
		defaultList.add("Apple");
		defaultList.add("Orange");
		defaultList.add("Pineapple");
		defaultList.add("Banana");
		
		System.out.println("Default Constructor list "+defaultList);
		
		// Constructor with Initial Capacity

		ArrayList<Integer> capacityList= new ArrayList<Integer>(5);
		capacityList.add(10);
		capacityList.add(20);
		capacityList.add(30);
		capacityList.add(40);
		capacityList.add(50);
		capacityList.add(60);
		capacityList.add(70);
		
		System.out.println("Initial Constructor "+capacityList);
		
		
		// Constructor with Collection
		
		List<String> existingList = Arrays.asList("Cat","Dog");
		ArrayList<String> collectionList = new ArrayList<String>(existingList);
		System.out.println("Collection List "+collectionList);
		
		
		// Verifying  Dynamic growth
		
		capacityList.add(50);
		
		
		
		
	}

}
