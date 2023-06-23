package com.java;

public class Count_Number_Of_Vowels {
	
	public static void main(String[] args) {
		
		String s = "ManiKandan";
		
		int vowelCount=0; //0
		
		String str = s.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			//i=0; 0<10 i=0;
			//i=1; 1<10 i=1;
			//i=2; 2<10 i=2;
			//i=3; 3<10 i=3;
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||str.charAt(i)== 'u') {
				//m=='a' || m=='e' ||m=='i' ||m=='o' || m=='u'
				//a=='a'
				//n='a'||n='e'||n='i'||n='o'||n='u'
				//i=='a'||i=='e'||i=='i'
				vowelCount++;
				
			}
			
			
		}
		
		System.out.println(vowelCount);//4

		
	}

}
