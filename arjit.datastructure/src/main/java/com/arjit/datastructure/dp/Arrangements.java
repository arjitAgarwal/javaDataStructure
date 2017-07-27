package com.arjit.datastructure.dp;

public class Arrangements {
	
	
	static int calculateMaxArrangements(int n) {
		if (n < 1) {
			return 0;
		} else {
			return (calculateMaxArrangements(n - 1) + calculateMaxArrangements(n - 3) + calculateMaxArrangements(n - 5));
		}
	}

	public static void main(String[] args) {

		
		/*Problem
			Given 3 numbers {1, 3, 5}, we need to tell
			the total number of ways we can form a number 'N' 
			using the sum of the given three numbers.
			(allowing repetitions and different arrangements).

				Total number of ways to form 6 is : 8
					1+1+1+1+1+1
					1+1+1+3
					1+1+3+1
					1+3+1+1
					3+1+1+1
					3+3
					1+5
					5+1
					*/
		
		System.out.println(calculateMaxArrangements(7));
	}

}
