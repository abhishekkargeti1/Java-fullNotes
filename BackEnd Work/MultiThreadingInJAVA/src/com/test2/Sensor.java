package com.test2;

public class Sensor implements Runnable{

	private String sensorName;
	private int interval;
	
	public Sensor(String sensorName,int interval) {
		this.interval=interval;
		this.sensorName = sensorName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(sensorName+" Sending Data...("+i+")");
				Thread.sleep(interval*1000);
			}
			
		}catch (Exception e) {
			System.out.println(sensorName+ " was Interrupted");
		}
	}
	
}
