package com.java;

public class String_Occurances {
	
	public static void main(String[] args) {
		
		String s = "Bala";
		
		char toFind ='a';
		
		int occurance = 0;
		
		 String lowerCase = s.toLowerCase();
		for (int i = 0; i <s.length(); i++) {
			//i=0 0<4  i=0;
			//i=1 1<4  i=1
			//i=2 2<4 i=2
			//i=3 3<4 i=3
			if (lowerCase.charAt(i)==toFind) {
				//0 (B)== 'a'
				//1 (a)=='a'
				//2 (l)=='a'
				//3 (a)=='a'
				occurance =occurance+1;
				//occurance =2
			}
		}
		
		System.out.println(toFind +" Occurance is "+occurance);
		
		
		
		
	}

}
