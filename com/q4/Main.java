package com.q4;

public class Main {
	
	static int Fact(int f) {
		int fact = 1;
		for(int i = f; i >= 1; i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		if(args.length >= 3) {
			System.out.println("Error");
		}
		else if(args.length == 2) {
			int a = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
			int num = Math.abs(a);
			int fact = Main.Fact(num);
			System.out.println(fact);
		}
		else if(args.length == 1) {
			int a = Integer.parseInt(args[0]);			
			int fact = Main.Fact(a);
			System.out.println(fact);
		}
		
	}

}
