package com.github.rshtishi.recursion;

public class CanConstruct {

	public static boolean compute(String target, String[] wordBank) {
		if (target.isEmpty()) {
			return true;
		}
		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String newTarget = target.substring(word.length());
				if (compute(newTarget, wordBank)) {
					return true;
				}
			}

		}
		return false;
	}

}
