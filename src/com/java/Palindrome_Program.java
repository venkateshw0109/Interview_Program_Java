package com.java;

public class Palindrome_Program {
	
	public static void main(String[] args) {
		
		
		String s = "Malayalam";
		
		String reverse ="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			reverse = reverse+s.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		if (reverse.equalsIgnoreCase(s)) {
			
			System.out.println("palindrome");
		} else {

			System.out.println("not a palindrome");
		}
		
		
	}

}
