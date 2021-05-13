package com.github.rshtishi.iterative;

import java.util.ArrayList;
import java.util.List;

public class TabulationHowSum {

	public static List<Integer> compute(int num, int[] values) {
		List<List<Integer>> arrayList = new ArrayList<>();
		arrayList.add(new ArrayList<Integer>());
		for (int i = 1; i <= num; i++) {
			arrayList.add(null);
		}
		for (int i = 0; i <= num; i++) {
			if (arrayList.get(i) != null) {
				for (int value : values) {
					int index = i + value;
					if(index<num+1) {
						List<Integer> temp = new ArrayList<>();
						temp.addAll(arrayList.get(i));
						temp.add(value);
						arrayList.set(index, temp);
					}
				}
			}

		}
		return arrayList.get(num);
	}

}
