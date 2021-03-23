package com.github.rshtishi.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoizationHowSum {

	public static List<Integer> compute(int num, int[] values, Map<Integer, List<Integer>> map) {
		if(map.containsKey(num)) {
			return map.get(num);
		}
		if(num==0) {
			return new ArrayList<Integer>();
		}
		if(num<0) {
			return null;
		}
		for(int value: values) {
			int remainder = num - value;
			List<Integer> remainderResult = compute(remainder,values,map);
			if(remainderResult!=null) {
				remainderResult.add(value);
				map.put(num,remainderResult);
				return remainderResult;
			}
		}
		map.put(num, null);
		return null;
	}

}
