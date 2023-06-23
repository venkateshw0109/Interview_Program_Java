package com.java;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		//0 1 1 2 3 5 8
		
		int temp =0;
		
		int first =2;
		
		int second = 3;
		
		for (int i = 0; i <=8; i++) {
			
			// 0<=8 i=0
			//1<=8 i=1
			//2<=8 i=2
			//3<=8 i=3
			//4<=8 i=4
			//5<=8 i=5
			//6<=8 i=6
			//7<=8 i=7
			//8<=8 i=8

			System.out.println(first);//0 1 1 2 3 5 8 13 21
			
			temp=first+second; //temp = 55
			first=second; //first= 34
			second=temp;//second= 55
			
		}
		
	}
	
	

}
