package com.q3;

import java.util.Arrays;

public class Main{
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		int primes = 0;
		for(int i = 0; i < inputArray.length; i++) {
			int factors = 0;
			
			for(int j = 1; j <= inputArray[i]; j++) {
				if(inputArray[i] % j == 0) {
					factors++;
				}
			}
			if(factors ==2)
			{ primes++; }
			else {
				inputArray[i] = 0;
			}
		}
		//create a second array of int		
		
		if(primes == 0) {
			System.out.println("Prime number not found in the supplied Array");
			return new int[1];
		}
		else {
			int[] prm = new int[primes];
			
			int z = 0;
			for(int i = 0; i < inputArray.length; i++) {			
				
				if(inputArray[i] != 0) {
					prm[z] = inputArray[i];
					z++;
				}				
			}
			
			return prm;
		}
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
	}
	
	public static void main(String[] args){
		
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		//print each element from the returned array of findAndReturnPrimeNumbers method
		
		Main main1 = new Main();
		int[] res = main1.findAndReturnPrimeNumbers(arr);
		if(res[0] != 0) {
			System.out.println(Arrays.toString(res));
		}
		
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
	}
}
