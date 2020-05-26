package com.github.rshtishi.iterative;

public class Factorial {
	
	public static int compute(int n) {
		int factorialN=1;
		for(int i=n;i>1;i--) {
			factorialN*=i;
		}
		return factorialN;
	}

}
