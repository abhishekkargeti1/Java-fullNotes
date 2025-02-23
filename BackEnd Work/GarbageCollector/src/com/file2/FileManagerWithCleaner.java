package com.file2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.Cleaner;

public class FileManagerWithCleaner {

	private static final Cleaner cleaner = Cleaner.create();
	private FileInputStream fileinput;
	private final Cleaner.Cleanable cleanable;
	
	private static class State implements Runnable{
		
		private FileInputStream fileInputStream;
		
		public State(FileInputStream fileInputStream) {
			this.fileInputStream = fileInputStream;
		}

		@Override
		public void run() {
			
			try{
				if(fileInputStream !=null) {
					System.out.println("Closing File using Cleaaner");
					fileInputStream.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		
	} 
	public FileManagerWithCleaner(String filePath)throws IOException {
		this.fileinput= new FileInputStream(new File(filePath));
		this.cleanable=cleaner.register(this, new State(fileinput));
		
	}
	
	public void readData() {
		System.out.println("Reading Data From File");
	}
	
	public static void main(String []args) throws IOException {
		FileManagerWithCleaner fmc = new FileManagerWithCleaner("D:\\Ducat Work\\BackEnd Work\\GarbageCollector\\src\\file\\ExampleFile");
		fmc.readData();
	}
}
