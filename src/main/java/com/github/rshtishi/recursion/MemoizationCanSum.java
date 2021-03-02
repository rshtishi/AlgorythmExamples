package com.github.rshtishi.recursion;

import java.util.Map;

public class MemoizationCanSum {

	public static boolean compute(int num, int[] values, Map<Integer,Boolean> map) {
		if(map.containsKey(num)) {
			return map.get(num);
		}
		if(num==0) {
			return true;
		}
		if(num<0) {
			return false;
		}
		for(int value:values) {
			int tmp = num-value;
			if(compute(tmp,values,map)==true) {
				map.put(num,true);
				return true;
			}
		}
		map.put(num,false);
		return false;
	}

}
