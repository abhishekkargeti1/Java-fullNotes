package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileManager {

	private FileInputStream fileinput;
	
	
	public FileManager(String path) throws IOException {
		super();
		this.fileinput = new FileInputStream(new File(path));
	}
	
	public void readData() throws IOException {
		int i=0;
		while((i=fileinput.read())!=-1){
			System.out.print((char)i);
		}
		System.out.println("\n Reading data From File");
	}
	
	

	@Override
	protected void finalize() throws Throwable {
		if(fileinput !=null) {
			System.out.println("Closing File in Finalize");
			fileinput.close();
		}
	}

	public static void main(String[] args) throws IOException {
			
		FileManager fm = new FileManager("D:\\Ducat Work\\BackEnd Work\\GarbageCollector\\src\\file\\ExampleFile");
		fm.readData();
		
	}

}
