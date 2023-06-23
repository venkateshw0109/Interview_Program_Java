package com.java;

public class Max_And_Min_Number_In_Array {
	
	public static void main(String[] args) {
		
		
		int arr[] = {2,8,6,1,5};
		
		int max=0;
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			//i=0; 0<5 i=0
			//i=1; 1<5 i=1
			//i=2; 2<5 i=2
			//i=3; 3<5 i=3
			//i=4; 4<5 i=4
			
			if (arr[i]>max) {//arr[0]>0 // 2>0
				             //arr[1]>2//  8>2
				             //arr[2]>8//  6>8
				             //arr[3]>8//  1>8
				             //arr[4]>8//  5>8
				max=arr[i]; //max=8
			}
			
			else if (arr[i]<min) { //arr[3]<2; 1<2 ; 5<1
				
				min=arr[i]; //min=1
			}
			
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
