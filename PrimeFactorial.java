package com.aadarsh;

public class PrimeFactorial {
	
	
	static void primeFactors(int a) {
		
		if (a<2) {
			
			System.out.println("no possible solution");
		}
		
		for(int i = 2;i<=a;i++) {
			if(a%i==0) {
				
				int c =0;
				for(int j=2;j<=i;j++) {
					if(i%j==0) {
						c++;
					}
				}
				
				if (c==1) {
					System.out.println(i);
				}
			}
		}
		
		System.out.println("=========================");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primeFactors(7);
		
		primeFactors(10);
		primeFactors(34);
		
		
	}

}
