package com.java;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		//1*2*3*4*5 = 120
		
		int i,fact =1;
		
		int number =5;
		
		for (i = 1; i<=number; i++) {
			//j=1 ; 1<=5 j=1
			//j=2 ; 2<=5 j=2
			//j=3; 3<=5 j=3
			//j=4; 4<=5 j=4
			//j=5; 5<=5 j=5
			fact=fact*i; //fact =24*5 =120
			System.out.println(fact);
		}
		
		System.out.println(fact);
	}

}
