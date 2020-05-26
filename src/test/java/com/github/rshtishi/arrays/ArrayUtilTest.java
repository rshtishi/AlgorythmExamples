package com.github.rshtishi.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.rshtishi.arrays.ArrayUtil;

public class ArrayUtilTest {

	@Test
	public void testFindMissingNumbers() {
		// setup
		int[] numbers = new int[] { 1, 2, 3, 4, 6, 9, 8 };
		int arraySize = 10;
		// execute
		int[] missingNumbers = ArrayUtil.findMissingNumbers(numbers, arraySize);
		// verify
		int[] expected = new int[] { 5, 7, 10 };
		assertArrayEquals(expected, missingNumbers);
	}

	@Test
	public void testFindDuplicateNumbers() {
		// setup
		int[] numbers = new int[] { 1, 1, 2, 2, 3, 3, 5 };
		// execute
		int[] duplicateNumbers = ArrayUtil.findDuplicateNumbers(numbers);
		// verify
		int[] expected = new int[] { 1, 2, 3 };
		assertArrayEquals(expected, duplicateNumbers);
	}

	@Test
	public void testfindMaxAndMinNumbers() {
		// setup
		int[] numbers = new int[] { -2, 14, 21, -8, 12 };
		// execute
		int[] extremesArr = ArrayUtil.findMaxAndMinNumbers(numbers);
		// verify
		int[] expected = new int[] { 21, -8 };
		assertArrayEquals(expected, extremesArr);
	}

	@Test
	public void testReverseArray() {
		// setup
		int[] numbers = new int[] { 1, 10, 100, 1000, 10000 };
		// execute
		int[] reversedNumbers = ArrayUtil.reverseArray(numbers);
		//
		int[] expectedNumbers = new int[] { 10000, 1000, 100, 10, 1 };
		assertArrayEquals(expectedNumbers, reversedNumbers);
	}

	@Test
	public void testSearchNumber() {
		// setup
		int[] numbers = new int[] { 1, 3, 55, 8, 22, 9 };
		// execute
		int numberPos = ArrayUtil.searchNumber(numbers, 55);
		// verify
		int expected = 2;
		assertEquals(expected, numberPos);
	}

	@Test
	public void testBinarySearchNumber() {
		// setup
		int[] numbers = new int[] { 1, 3, 55, 8, 22, 9, 11, 0 };
		// execute
		boolean found = ArrayUtil.binarySearchNumber(numbers, 8);
		// verify
		assertTrue(found);

	}

	@Test
	public void testSortArray() {
		// setup
		int[] numbers = new int[] { 1, 5, 6, 0, 2 };
		// execute
		int[] sortedNumbers = ArrayUtil.sortArray(numbers);
		// verify
		int[] expectedNumbers = new int[] { 0, 1, 2, 5, 6 };
		assertArrayEquals(expectedNumbers, sortedNumbers);
	}

	@Test
	public void testMergeSort() {
		// setup
		int[] numbers = new int[] { 1, 3, 4, 5, 2, 8 };
		// execute
		ArrayUtil.mergeSort(numbers, 0, numbers.length - 1);
		// verify
		int[] expectedNumbers = new int[] { 1, 2, 3, 4, 5, 8 };
		assertArrayEquals(expectedNumbers, numbers);
	}

	@Test
	public void maxSubArraySum() {
		// setup
		int[] numbers = new int[] { -2, 3, 5, -5, 7, 0 };
		// execute
		int maxSubArraySum = ArrayUtil.findMaxSubArraySum(numbers, 0, numbers.length - 1);
		// verify
		System.out.println(maxSubArraySum);
	}

}
