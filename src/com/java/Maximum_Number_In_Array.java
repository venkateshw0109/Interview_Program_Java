package com.java;

public class Maximum_Number_In_Array {
	
	
	public static void main(String[] args) {
		
		
		int a[] = {5,4,6,2,8,1};
		
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			//int i=0; 0<6 i=0;
			//int i=1; 1<6 i=1;
			//int i=2; 2<6 i=2;
			//int i=3; 3<6 i=3;
			//int i=4; 4<6 i=4;
			//int i=5; 5<6 i=5;
			if (a[i]>max) {
				//a[0]>0 //5>0
				//a[1]>5 //4>5
				//a[2]>5// 6>5
				//a[3]>6 // 2>6
				//a[4]>6 // 8>6
				//a[5]>8// 1>8
				max=a[i]; //max=8
			}
			
		}
		
		System.out.println(max);
	}

}
