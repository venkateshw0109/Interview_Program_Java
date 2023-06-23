package com.java;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num =4;
		
		int count =0;
		
		for (int i = 2; i < num; i++) {
			//i=2 2<4 i=2
			//i=3 3<4 i=3
			
			if (num%i==0) {//4%2 //4%3 
				
				count++; // count=1
			}
		}
		
		
		if (count>0) {
			
			System.out.println("not a prime number");
		} else {
			
			System.out.println("prime number");

		}
	
	}

}
