package com.github.rshtishi.recursion;

public class Fibonacci {
	
	public static long compute(int n) {
		if(n==0) {
			return 0;
		}
		if(n<=2) {
			return 1;
		}
		return compute(n-1)+compute(n-2);
	}

}
