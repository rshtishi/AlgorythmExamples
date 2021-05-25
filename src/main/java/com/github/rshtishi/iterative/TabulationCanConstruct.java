package com.github.rshtishi.iterative;

public class TabulationCanConstruct {

	public static boolean compute(String target, String[] wordBank) {
		boolean[] array = new boolean[target.length() + 1];
		array[0] = true;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==true) {
				String temp = target.substring(i);
				for(String word:wordBank) {
					if(temp.startsWith(word)) {
						int index=i+word.length();
						array[index]=true;
					}
				}
			}
		}
		return array[target.length()];
	}

}
