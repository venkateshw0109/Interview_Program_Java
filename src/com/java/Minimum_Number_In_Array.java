package com.java;

public class Minimum_Number_In_Array {
	
	public static void main(String[] args) {
		
		
		int a[] = {8,2,5,1,6};
		
		int min =a[0];//1
		
		for (int i = 0; i < a.length; i++) {
			//int i=0; 0<5 i=0;
			//int i=1; 1<5 i=1;
			//int i=2; 2<5 i=2;
			//int i=3; 3<5 i=3;
			//int i=4; 4<5 i=4;
			if (a[i]<min) {
			//a[0]<8 // 8<8
			//a[1]<8 //2<8
			//a[2]<2 //5<2
			//a[3]<2// 1<2
			//a[4]<1// 6<1
				min = a[i];//min=1;
			}
		}
		
		System.out.println(min);
	}

}
