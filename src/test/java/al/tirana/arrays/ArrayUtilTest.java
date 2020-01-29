package al.tirana.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

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
		int[] numbers = new int[] { -2, 14, 21, -8, 12};
		//execute
		int[] extremesArr = ArrayUtil.findMaxAndMinNumbers(numbers);
		//verify
		int[] expected = new int[] { 21, -8};
		assertArrayEquals(expected, extremesArr);
	}

}
