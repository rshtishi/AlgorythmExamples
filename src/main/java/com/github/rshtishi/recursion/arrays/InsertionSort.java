package com.github.rshtishi.recursion.arrays;

public class InsertionSort {

	public static void sort(int[] A, int size) {
		if (size > 1) {
			sort(A, size - 1);
		}
		int key = A[size];
		int index = 0;
		while (index < size) {
			if (A[index] > key) {
				int tmp = key;
				key = A[index];
				A[index] = tmp;
			}
			index++;
		}
		A[index] = key;
	}

}
