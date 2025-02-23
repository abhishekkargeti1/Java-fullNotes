package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	private static final String email = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

	public static void main(String[] args) {
		String[] arr = { "abhishek.kargeti@gmail.com", "nikhil.kargeti@gmail.com", "invalidgmail.com" };
		for(String a : arr) {
			System.out.println(a +" is Valid "+isValidEmail(a));
		}
		
		
	}
	public static boolean isValidEmail(String e) {
		Pattern p =Pattern.compile(email);
		Matcher m = p.matcher(e);
		return m.matches();
	}

	
}
