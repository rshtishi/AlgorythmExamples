package com.github.rshtishi.iterative;

public class TabulationFibonacci {
	
	public static long compute(int n) {
		long[] array = new long[n+1];
		array[0] = 0;
		array[1] = 1;
		for(int i=0; i<array.length-1;i++) {
			array[i+1]+=array[i];
			if(i+2<=array.length-1) {
				array[i+2]+=array[i];
			}
		}
		return array[array.length-1];
	}

}
