package com.github.rshtishi.recursion;

import java.util.ArrayList;
import java.util.List;

public class HowConstruct {
	
	public static List<String> compute(String target, String[] wordBank){
		if(target.equals("")) {
			return new ArrayList<>();
		}
		for(String word : wordBank) {
			if(target.startsWith(word)) {
				String suffix = target.substring(word.length());
				List<String> suffixResult = compute(suffix,wordBank);
				if(suffixResult!=null) {
					suffixResult.add(word);
					return suffixResult;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		List<String> result = HowConstruct.compute("Rando", new String[] { "Ra", "do", "n", "Rand" });
		System.out.println(result);
	}

}
