package com.github.rshtishi.iterative;

public class TabulationCountConstruct {

	public static int compute(String target, String[] wordbank) {
		int[] array = new int[target.length() + 1];
		array[0] = 1;
		for (int index = 0; index<= target.length(); index++) {
			for(String word:wordbank) {
				int newIndex = index+word.length();
				if(newIndex<array.length && target.substring(index, newIndex).equals(word)) {
					array[newIndex]+=array[index];
				}
			}
		}
		return array[target.length()];
	}
	

}
