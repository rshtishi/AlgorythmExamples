package com.github.rshtishi.recursion;

import java.util.ArrayList;
import java.util.List;

public class HowSum {
	
	public static List<Integer> compute(int num, int[] values) {
		if(num==0) {
			return new ArrayList<Integer>();
		}
		if(num<0) {
			return null;
		}
		for(int value: values) {
			int remainder = num - value;
			List<Integer> remainderResult = compute(remainder,values);
			if(remainderResult!=null) {
				remainderResult.add(value);
				return remainderResult;
			}
		}
		return null;
	}

}
