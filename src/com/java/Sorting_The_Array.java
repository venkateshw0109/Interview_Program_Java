package com.java;

public class Sorting_The_Array {
	
	public static void main(String[] args) {
		
		int a[]= {56,89,6,45,8,54};
		//       {6,56,89,45,8,54}
		//       {6,8,56,89,45,54}
		//       {6,8,45,56,89,54}
		
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			//int i=0; 0<6 i=0;
			//int i=1; 1<6 i=1;
			//int i=2; 2<6 i=2;
			for (int j = i; j < a.length; j++) {
				//int j=2; 2<6 j=2;
				//int j=3; 3<6 j=3;
				//int j=4; 4<6 j=4;
				//int j=5; 5<6 j=5;



				if (a[i]>a[j]) { //a[2]>a[2] 56>56 //a[2]>a[3] 56>89 //a[2]>a[4] 56>45 // 45>a[5] 45>54
				 //a[	
					temp=a[i];//temp= 56
					a[i]=a[j];//a[i]= 45
					a[j]=temp;//a[j]= 56
				}
			}
			
			System.out.println(a[i]);
		}
	}

}
