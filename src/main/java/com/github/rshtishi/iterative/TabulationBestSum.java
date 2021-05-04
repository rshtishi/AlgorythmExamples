package com.github.rshtishi.iterative;

import java.util.ArrayList;
import java.util.List;

public class TabulationBestSum {

	public static List<Integer> compute(int num, int[] values) {
		List<List<Integer>> list = new ArrayList<>(num + 1);
		list.add(new ArrayList<Integer>());
		for (int i = 1; i <= num; i++) {
			list.add(null);
		}
		for (int i = 0; i < num; i++) {
			if (list.get(i) != null) {
				for (int value : values) {
					int index = i + value;
					if (index < num+1) {
						List<Integer> temp = new ArrayList<>();
						temp.addAll(list.get(i));
						temp.add(value);
						if (list.get(index) == null || list.get(index).size() > temp.size()) {
							list.set(index, temp);
						}
					}
				}
			}
		}
		return list.get(num);
	}

	public static void main(String[] args) {
		int[] test = new int[] { 2, 5 };
		System.out.println(TabulationBestSum.compute(10, test));
	}

}
