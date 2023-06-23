package com.java;

public class Reverse_The_String {
	
	public static void main(String[] args) {
		
		String s = "Bala";
		
		String rev = "";
		
		for (int i = s.length()-1; i>=0; i--) {
		//int i=3 i>=0; 3>=0 i=3
		//int i=2 2>=0 i=2
		//int i=1 1>=0 i=1
		//int i=0 0>=0 i=0
			
			rev=rev+s.charAt(i);
			//rev=al
			
		}
		
		System.out.println(rev);
	}

}
