package com.Arrays;

public class Test2 {
	
	static void min(int arr[]) {
		int min = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum value in arr is " + min);
	}	
	public static void main(String []args) {
//		int arr[] = {89,96,78,45,25};
		
		min(new int []{89,96,78,45,25});
	}
}
	