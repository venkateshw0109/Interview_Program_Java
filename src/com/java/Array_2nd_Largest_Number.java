package com.java;

public class Array_2nd_Largest_Number {
	
	public static void main(String[] args) {
		
		int a[]= {5,45,52,8,6,2,1};
		
		int first = 0;
		
		int second = 0;
		
		for (int i = 0; i < a.length; i++) {
			//int i=0; 0<6 i=0
			//int i=1; 1<6 i=1
			//int i=2; 2<6 i=2
			//int i=3; 3<6 i=3
			//int i=4; 4<6 i=4
			//int i=5; 5<6 i=5
			
			if (a[i]>first) { //a[0]>0 //5>0
				              //a[1]>5 //4>5
				              //a[2]>5 //8>5
				              //a[3]>8 //6>8
				              //a[4]>8 //2>8
				              //a[5]>8 //1>8
				second = first;//second=5,
				first=a[i];//first=8
			}
			
			else if (a[i]>second) {//6>5//2>6//1>6
				
				second = a[i];//second=6
				
			}
			
		}
		System.out.println(first);
		System.out.println(second);
	}

}
