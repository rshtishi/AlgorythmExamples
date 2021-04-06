package com.github.rshtishi.iterative;

import java.util.ArrayList;
import java.util.List;

public class TabulationHowSum {
	
	public static List<Integer> compute(int num, int[] values) {
		List<List<Integer>> arrayList = new ArrayList<>();
		arrayList.add(new ArrayList<Integer>());
		for(int i=0;i<=num;i++) {
			for(int value:values) {
				int index = i+value;
				if( arrayList.get(index)!=null) {
					arrayList.set(index, arrayList.get(i));
					arrayList.get(index).add(value);
				}
			}
		}
		return arrayList.get(num);
	}

}
