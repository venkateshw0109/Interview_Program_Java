package com.java;

public class Demo {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			// int i=1; 1<=3 i=1;
			// int i=2; 2<=3 i=2;
			// int i=3; 3<=3 i=3;
			for (int j = 1; j <= 3; j++) {
				// int j=1; 1<=1 j=1; i=1

				// int j=1 1<=2 j=1; i=2
				// int j=2 2<=2 j=2; i=2

				// int j=1 1<=3 j=1; i=3
				// int j=2 2<=3 j=2; i=3
				// int j=3 3<=3 j=3; i=3

				System.out.println(i);
			}
			System.out.println();
  
		}

	}

}
