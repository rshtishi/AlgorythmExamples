package com.github.rshtishi.recursion.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testQuickSort() {
		// setup
		int[] numbers = new int[] { 1, 3, 4, 5, 2, 8 };
		// execute
		QuickSort.quickSort(numbers, 0, numbers.length - 1);
		// verify
		int[] expected = new int[] { 1, 2, 3, 4, 5, 8 };
		assertArrayEquals(expected, numbers);
	}

}
