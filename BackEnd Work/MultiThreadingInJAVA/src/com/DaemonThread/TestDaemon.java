package com.DaemonThread;

public class TestDaemon extends Thread {
	public TestDaemon() {
		setDaemon(true);
	}
	
	public void run() {
		while(true) {
			try {
				System.out.println("Memory Cleaner running in Background ");
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println("Memoery Clearner Interrupted");
			}
		}
	}
}
