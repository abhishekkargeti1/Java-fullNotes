package com.vector;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

  public static void main(String[] args) {
    
    //Default Constructor 
    Vector<String> vector1 = new Vector<String>();
    
    //Constructor with intial capacity
    Vector<Integer> vector2 = new Vector<Integer>(5);
    
    //Constructor with intial Capacity and capacity Increment
    Vector<Double> vector3 = new Vector<Double>(5,2);
    
    //Constructor using another Collecton
    List<String> list = Arrays.asList("Apple","Banana","Cherry");
    Vector<String> vector4 = new Vector<String>(list);
    
    //Basic Method
    
    vector1.add("Java");
    vector1.add("Python");
    vector1.add("C++");
    
    vector2.add(10);
    vector2.add(20);
    vector2.add(30);
    //Accessing Elements
    System.out.println("Element at index 1 in vector1: "+vector1.get(1));
    //Removing Element
    vector1.remove("Python");
    vector2.remove(1);
    
    //Update elements 
    vector1.set(1, "C#");
    //Iterating through a Vector using for-each loop
    System.out.println("Elements in Vector1 : ");
    for(String lang:vector1)
    {
      System.out.println(lang);
    }
    //Checking if an element exists
    System.out.println("Contains Java : "+vector1.contains("Java"));
    
    //checking size and Capacity
    System.out.println("Size of Vector1 "+vector1.size());
    System.out.println("Capacity of Vector3: "+vector3.capacity());
    
    
    vector1.addAll(Arrays.asList("Ruby","Go"));
    Enumeration<String> elements = vector1.elements();
    System.out.println("Element Using Enumeration: ");
    while (elements.hasMoreElements()) {
      String string = (String) elements.nextElement();
      
      System.out.println(string);
      
    }
  }

}