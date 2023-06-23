package com.java;

import java.util.Scanner;

public class Reverse_The_Number {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int temp =0;
		
		int rem =0;
		
		System.out.println("Enter a Number");
		
		int num = s.nextInt();
		
		while (num>=1) {//1234>=1 //123>=1 //12>=1 //1>=1
			
			
			rem=num%10;//rem= 1%10 =1
			temp=temp*10+rem;//temp=4 // temp = 43 // temp =432 temp = 4321
			num=num/10;//num=12/10 = 1
			
		}
		
		System.out.println(temp);
	}

}
