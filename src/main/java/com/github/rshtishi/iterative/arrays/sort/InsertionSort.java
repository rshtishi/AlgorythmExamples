package com.github.rshtishi.iterative.arrays.sort;

public class InsertionSort {

	public static void sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = key;
		}
	}
}
