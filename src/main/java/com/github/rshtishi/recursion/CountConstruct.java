package com.github.rshtishi.recursion;

public class CountConstruct {
	
	public static int compute(String target,String[] wordBank) {
		if(target.equals("")) {
			return 1;
		}
		int totalCount = 0;
		for(String word:wordBank) {
			if(target.startsWith(word)) {
				String newTarget = target.substring(word.length());
				int numWays = compute(newTarget, wordBank);
				totalCount+=numWays;
			}
		}
		return totalCount;
	}

}
