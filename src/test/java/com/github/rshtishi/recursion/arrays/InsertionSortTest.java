package com.github.rshtishi.recursion.arrays;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test() {
		// setup
		int[] actual = { 1, -1, 4, 5, -3, 0 };
		int[] expected = { -3, -1, 0, 1, 4, 5 };
		// execute
		InsertionSort.sort(actual, actual.length - 1);
		// verify
		Assert.assertArrayEquals(expected, actual);
	}

}
