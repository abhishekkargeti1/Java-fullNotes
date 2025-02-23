package com.EMUN;

public class TestClass {

	public static void main(String[] args) {
		
		TestEMUN [] t1 = TestEMUN.values();
		System.out.println(t1.length);
		for(TestEMUN t2 :t1) {
			System.out.println(t2.name()+" "+t2.ordinal());
		}
			new TestClass().LogicCheck(TestEMUN.FEB);
	}
		public void LogicCheck(TestEMUN month) {
			switch (month) {
			case JAN: {
				System.out.println("Jan is First Month");
				break;
			}
			case FEB: {
				System.out.println("FEB is Second Month");
				break;
			}
			case MAR: {
				System.out.println("March is Thrid Month");
				break;
			}
			default:
				System.out.println("Invalid Input");
			}

		}
}
