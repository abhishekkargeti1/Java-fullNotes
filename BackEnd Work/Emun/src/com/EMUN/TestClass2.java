package com.EMUN;

public class TestClass2 {

	public static void main(String[] args) {
		
		Enum1 [] e = Enum1.values();
		System.out.println(e);
		System.out.println(e.length);
		
		for(Enum1 e1: e ) {
			System.out.println(e1.name());
			System.out.println(e1.ordinal());
			System.out.println(e1.getMonthValue());
			System.out.println(e1.getMonthName());
		}

	}

}
