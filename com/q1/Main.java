package com.q1;

import java.util.Scanner;

public class Main {
	
	public static String reversString(String input){

		char[] charArray = input.toCharArray();
		
		StringBuilder str = new StringBuilder();
		for(int i = (input.length()-1); i >= 0; i--) {
			str.append(charArray[i]);
		}		
		
		return str.toString();		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		
		String result = reversString(originalString);

		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);

	}

}
