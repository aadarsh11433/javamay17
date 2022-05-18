package com.aadarsh;

public class CricketScore {

	
	static void totalRuns(int ones, int twos,int threes, int fours ,int sixes) {
		
		int total = 1*ones + 2*twos + 3* threes + 4*fours + 6 *sixes;
		
		System.out.println(total);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ones = 15;
		int twos = 5;
		int threes = 3;
		int fours = 4;
		int sixes = 3;
		
		totalRuns(ones, twos, threes, fours, sixes);

	}

}
