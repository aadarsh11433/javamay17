package com.aadarsh;

public class SumOfNaturalNumbers {

	
	static void sum(int a) {
		
		int sum = 0;
		
		for(int x=1;x<=a;x++) {
			sum +=x;
		}
		
		System.out.println(sum);
	}
	
	static void byformula(int a) {
		
		int sum = (a*(a+1))/2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 5;
		
		sum(i);
		byformula(i);
		
		
		sum(8);
		byformula(8);
		
	}

}
