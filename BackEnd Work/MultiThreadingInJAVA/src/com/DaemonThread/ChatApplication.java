package com.DaemonThread;

public class ChatApplication {

	public static void main(String[] args) {
		TestDaemon t1 = new TestDaemon();
		t1.start();
		System.out.println("Chat Application Started");
		
		for(int i =1;i<=3;i++) {
			System.out.println("User Meassage "+i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Chat  Application is Stopped");
	}

}
