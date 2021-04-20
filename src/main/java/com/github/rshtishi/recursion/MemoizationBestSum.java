package com.github.rshtishi.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MemoizationBestSum {
	
	public static List<Integer> compute(int num, int[] values, Map<Integer,List<Integer>>  map) {
		if(map.containsKey(num)) {
			return map.get(num);
		}
		List<Integer> bestSum = null;
		if (num == 0) {
			return new ArrayList<Integer>();
		}
		if (num < 0) {
			return null;
		}
		for (int value : values) {
			int remainder = num - value;
			List<Integer> remainderResult = compute(remainder, values, map);
			if (remainderResult != null) {
				remainderResult.add(value);
				if (bestSum == null || bestSum.size() > remainderResult.size()) {
					bestSum = remainderResult;
				}
			}
		}
		map.put(num,bestSum);
		return bestSum;
	}

}
