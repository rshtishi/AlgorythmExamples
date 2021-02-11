package com.github.rshtishi.recursion;

import java.util.Map;

public class MemoizationFibonacci {
	
	public static long compute(int n, Map<Integer,Long> map) {
		if(map.containsKey(n)) {
			return map.get(n);
		}
		if(n==0) {
			return 0;
		}
		if(n<=2) {
			return 1;
		}
		long value =  compute(n-1,map)+compute(n-2,map);
		map.put(n, value);
		return value;
	}

}
