package com.java;

public class Remove_Special_Characters {
	
	public static void main(String[] args) {
		
		
		String s = "Welcome%&$#%^toj*%^%$%a&**((*va";
		
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);
	}

}
