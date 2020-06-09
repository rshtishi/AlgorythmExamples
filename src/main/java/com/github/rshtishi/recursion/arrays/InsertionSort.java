package com.github.rshtishi.recursion.arrays;

public class InsertionSort {

	public static void sort(int[] A, int size) {
		if (size > 1) {
			sort(A, size - 1);
		}
		int key = A[size];
		int index = size - 1;
		while (index >= 0 && A[index] >= key) {
			A[index + 1] = A[index];
			index--;
		}
		A[index + 1] = key;
	}

}
