package com.github.rshtishi.iterative.arrays.sort;

public class InsertionSort {

	public static void sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = 0;
			while (j < i) {
				if (A[j] > key) {
					int tmp = key;
					key = A[j];
					A[j] = tmp;

				}
				j++;
			}
			A[j] = key;
		}
	}
}
