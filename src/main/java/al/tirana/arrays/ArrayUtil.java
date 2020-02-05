package al.tirana.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class ArrayUtil {

	public static int[] findMissingNumbers(int[] numbers, int arraySize) {
		int missingArraySize = arraySize - numbers.length;
		int[] missingNumbers = new int[missingArraySize];

		BitSet bitSet = new BitSet(arraySize);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}

		int lastMissingIndex = 0;
		for (int i = 0; i < missingArraySize; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			lastMissingIndex++;
			missingNumbers[i] = lastMissingIndex;
		}
		return missingNumbers;
	}

	public static int[] findDuplicateNumbers(int[] numbers) {
		int duplicateNumbersSize = numbers.length / 2;
		int[] duplicateNumbers = new int[duplicateNumbersSize];
		int index = 0;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1;) {
			int j = i + 1;
			while (numbers[i] == numbers[j]) {
				if (j - i == 1) {
					duplicateNumbers[index] = numbers[i];
					index++;
				}
				j++;
			}
			i = j;
		}
		return duplicateNumbers;
	}

	public static int[] findMaxAndMinNumbers(int[] numbers) {
		int maxNum = numbers[0];
		int minNum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxNum) {
				maxNum = numbers[i];
			} else if (numbers[i] < minNum) {
				minNum = numbers[i];
			}
		}
		int[] extremeArr = new int[2];
		extremeArr[0] = maxNum;
		extremeArr[1] = minNum;
		return extremeArr;
	}

	public static int[] reverseArray(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			int j = numbers.length - 1 - i;
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		return numbers;
	}
	
	public static int searchNumber(int[] numbers,int number) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==number) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean binarySearchNumber(int[] numbers, int number) {
		Arrays.sort(numbers);
		int lowIndex = 0;
		int highIndex = numbers.length;
		while(lowIndex<=highIndex) {
			int midIndex = (lowIndex+highIndex)/2;
			if(numbers[midIndex]==number) {
				return true;
			} else if(numbers[midIndex]<number) {
				lowIndex= midIndex+1;
			} else if(numbers[midIndex]>number) {
				highIndex = midIndex-1;
			}
		}
		return false;
	}

	public static int[] sortArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length ; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

}
