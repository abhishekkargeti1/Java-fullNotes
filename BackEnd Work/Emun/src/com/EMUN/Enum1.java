package com.EMUN;

public enum Enum1 {
		JAN("One",11),FEB("Two",12),MAR("Three",13);
		
	private int monthValue;
	private String monthName;
	
	 Enum1(String monthName,int monthValue) {
		this.monthValue = monthValue;
		this.monthName=monthName;
	}
	
	public int getMonthValue() {
		return monthValue;
	}
	public String getMonthName() {
		return monthName;
	}
}
