package com.github.rshtishi.recursion;

import java.util.Map;

public class MemoizationGridTraveler {

	public static long findNoRoutes(int rows, int cols, Map<String, Long> map) {
		String key = new StringBuffer().append(rows).append(",").append(cols).toString();
		if (map.containsKey(key)) {
			return map.get(key);
		}
		if (rows == 1 && cols == 1) {
			return 1;
		}
		if (rows == 0 || cols == 0) {
			return 0;
		}
		long result = findNoRoutes(rows - 1, cols, map) + findNoRoutes(rows, cols - 1, map);
		map.put(key, result);
		return result;
	}

}
