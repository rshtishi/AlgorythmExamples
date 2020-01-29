package al.tirana.arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testFindMissingNumbers() {
		//setup 
		int[] numbers = new int[] {1, 2, 3, 4, 6, 9, 8};
		int arraySize = 10;
		//execute
		int[] missingNumbers = ArrayUtil.findMissingNumbers(numbers,arraySize);
		//verify
		int[] expected = new int[] {5, 7, 10};
		assertArrayEquals(expected, missingNumbers);
	}
	
	@Test
	public void testfindDuplicateNumbers() {
		//setup 
		int[] numbers = new int[] {1, 1, 2, 2, 3, 3, 5};
		//execute
		int[] duplicateNumbers = ArrayUtil.findDuplicateNumbers(numbers);
		//verify
		System.out.println(Arrays.toString(duplicateNumbers));
	}

}
