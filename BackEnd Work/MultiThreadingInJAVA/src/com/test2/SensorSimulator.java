package com.test2;

public class SensorSimulator {

	public static void main(String[] args) {
		Thread sensor1 = new Thread(new Sensor("Temperature Sensor", 2));
		Thread sensor2 = new Thread(new Sensor("Presure Sensor", 3));
		Thread sensor3 = new Thread(new Sensor("Heat Sensor", 4));
		
		sensor1.start();
		sensor2.start();
		sensor3.start();
		
		try {
			sensor1.join();
			sensor2.join();
			sensor3.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
			e.printStackTrace();
		}
		
		System.out.println("All Sensors have finished sending Data");
	}

}
