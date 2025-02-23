package com.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String []args) {
		//1.Creating an ArrayList
	    
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    Collections.addAll(numbers, 15,8,52,23,4,16,8);
	    System.out.println("Original List : "+numbers);
	    
	    //2.Sorting in ascending order
	    
	    Collections.sort(numbers);
	    System.out.println("Sorted List (Ascending): "+numbers);
	    
	    //3. Sorting in Descending order using Comparator
	    numbers.sort(Comparator.reverseOrder());
	    System.out.println("Sorted List (Descending): "+numbers);
	    
	    //4. Remove Duplicate using streams
	    ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>(numbers.stream().distinct().collect(Collectors.toList()));
	    System.out.println("List After Removing Duplicates : "+uniqueNumbers);
	    
	    //5. Filtering Elements greater than a Value
	    ArrayList<Integer> filteredNumber = new ArrayList<Integer>(uniqueNumbers.stream().filter(n->n>10).collect(Collectors.toList()));
	    System.out.println("Filtered List (Values>10): "+filteredNumber);
	    
	    //6.Mapping Element (Square of each Element)
	    ArrayList<Integer> squaredNumbers = new ArrayList<Integer>(filteredNumber.stream().map(n->n*n).collect(Collectors.toList()));
	    System.out.println("Mapped List (Squares) : "+squaredNumbers);
	    
	    
			
			
		
	}
	

}
