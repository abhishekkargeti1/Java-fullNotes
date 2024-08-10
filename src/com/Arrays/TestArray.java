package com.Arrays;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Printing array elements");
		int sum = 0;
		int average = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			average = sum / arr.length;
		}
		System.out.println("Sum of array " + sum);
		System.out.println("Average of array " + average);
	}

}
