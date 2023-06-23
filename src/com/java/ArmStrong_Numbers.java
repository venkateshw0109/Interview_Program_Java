package com.java;

import java.util.Scanner;

public class ArmStrong_Numbers {
	
	public static void main(String[] args) {
		
		//153
		//1*1*1 + 5*5*5 + 3*3*3 = 153
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt(); //153
		
		int mem = num; //153
		
		int rem=0;
		
		int temp =0;
		
		while (num>=1) { //153>=1 // 15>=1 //1>=1
			//111
			rem=num%10; //rem=153%10 = 3  // rem = 15%10 = 5  // rem= 1%10 =1
			temp=temp+rem*rem*rem; // temp = 27 // temp = 152 // temp = 153
			num=num/10; // num=153/10 = 15 //num = 15/10 = 1
			
		}
		
		if (mem==temp) {
			
			System.out.println("ArmStrong Number");
		} else {
			
			System.out.println("Not a ArmStrong Number");

		}
		
	}

}
