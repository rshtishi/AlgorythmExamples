package com.github.rshtishi.iterative;

public class CanSum {

	public static boolean compute(int num, int[] values) {
		boolean[] array = new boolean[num+1];
		array[0]=true;
		for(int i=0; i<array.length;i++) {
			if(array[i]==true) {
				for(int value:values) {
					int index = i+value;
					if(index<array.length) {
						array[index]=true;
					}
				}
			}
		}
		return array[num];
	}

}
