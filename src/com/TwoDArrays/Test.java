package com.TwoDArrays;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		System.out.println("Enter Your Element ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		int sum =0;
		int average =0;
			for(int i =0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					sum +=arr[i][j];
					average =sum/arr.length;
				}
			}
			System.out.println(sum+" ");
			System.out.println(average+" ");
			System.out.println(arr.getClass().getName());
	}

}
