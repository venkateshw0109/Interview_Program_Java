package com.java;

public class Triangle_Program {

	public static void main(String[] args) {

		int i;
		int j;
		int row = 6;

		for (i = 0; i < row; i++) {
         //i=0 0<6 i=0;
		//i=1  1<6 i=1;
		//i=2  2<6 i=2;
			for (j = row - i; j > 1; j--) {
         //j= 6 6>1 j=6   || j= 5  5>1 j=5 || j=4 4>1 j=4
		//j=5   5>1 j=5   || j=4   4>1 j=4 || j=3 3>1 j=3
		//j=4   4>1 j=4   || j=3   3>1 j=3 || j=2 2>1 j=2
		//j=3   3>1 j=3   || j=2   2>1 j=2
		//j=2   2>1 j=2
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				//j=0; 0<=0 j=0
				//j=0; 0<=1 j=0;
				//j=1; 1<=1 j=1;
				//j=0; 0<=2 j=0;
				//j=1; 1<=2 j=1;
				//j=2; 2<=2 j=2;
				
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
