package com.github.rshtishi.recursion;

import java.util.Map;

public class MemoizationCountConstruct {

	public static int compute(String target, String[] wordBank, Map<String, Integer> map) {
		if (map.containsKey(target)) {
			return map.get(target);
		}
		if (target.equals("")) {
			return 1;
		}
		int totalCount = 0;
		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String newTarget = target.substring(word.length());
				int numWays = compute(newTarget, wordBank, map);
				totalCount += numWays;
				map.put(target, totalCount);
			}
		}
		return totalCount;
	}

}
