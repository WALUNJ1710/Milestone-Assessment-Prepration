package com.wipro.part1;

public class Problem1String {
	public static void main(String[] args) {
		String str = "JavaAngular";
		
		//To find frequency for lowercase alphabets
		int smallLetter[]=new int[26];
		
		//To find frequency for uppercase alphabets
		int capitalLetter[]=new int[26];
		
		//Updating the array with frequencies
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				smallLetter[ch-97]++;
			else if (Character.isUpperCase(ch))
				capitalLetter[ch-65]++;
		}
		for(int i=0;i<str.length();i++) 

		{ 

		char ch=str.charAt(i); 

		if (Character.isUpperCase(ch)) 

		{ 

		if (capitalLetter[(int)ch-65]==1) { 

		System.out.println("The alphabhet is "+(char)ch); 

		 break;} 

		} 
		else { 
		if (smallLetter[(int)ch-97]==1) 
		{ 
		System.out.println("The alphabhet is "+(char)ch); 
		break; 
		}} 
		} 
	}

}
