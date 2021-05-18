package com.github.rshtishi.recursion;

import java.util.Map;

public class MemoizationCanConstruct {
	
	public static boolean compute(String target, String[] wordBank, Map<String,Boolean> map) {
		if(map.containsKey(target)) {
			return map.get(target);
		}
		if(target.isEmpty()) {
			return true;
		}
		for(String word:wordBank) {
			if(target.startsWith(word)) {
				String newTarget = target.substring(word.length());
				if(compute(newTarget,wordBank,map)) {
					map.put(target, true);
					return true;
				}
			}
		}
		map.put(target, false);
		return false;
	}

}
