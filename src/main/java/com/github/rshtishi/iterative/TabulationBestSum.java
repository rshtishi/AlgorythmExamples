package com.github.rshtishi.iterative;

import java.util.ArrayList;
import java.util.List;

public class TabulationBestSum {

	public static List<Integer> compute(int num, int[] values) {
		List<List<Integer>> list = new ArrayList<>(num+1);
		list.add(new ArrayList<Integer>());
		for(int i=1;i<=num;i++) {
			list.add(null);
		}
		for (int i = 0; i < num; i++) {
			if (list.get(i) != null) {
				for (int value : values) {
					int index = i + value;
					List<Integer> combination = new ArrayList<>();
					combination.addAll(list.get(i));
					combination.add(value);
					if (list.get(index) == null || list.get(index).size() > combination.size()) {
						list.set(index, combination);
					}
				}
			}
		}
		return list.get(num);
	}

	public static void main (String[] args) {
		int[] test=new int[] { 3, 5, 7, 8 };
		TabulationBestSum.compute(8,test);
	}

}
