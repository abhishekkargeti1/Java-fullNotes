package com.test2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds =10;
		System.out.println("Starting Count Down Timer :  ");
		for(int i = seconds ; i>0; i--){
			System.out.println(i+" Second Remaining  ");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("CountDown Interrupted");
				}				
			}
		}
	}


