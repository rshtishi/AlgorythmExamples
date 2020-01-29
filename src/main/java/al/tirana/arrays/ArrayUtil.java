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
		int duplicateNumbersSize = numbers.length/2;
		int[] duplicateNumbers = new int[duplicateNumbersSize];
		int index = 0;
		Arrays.sort(numbers);
		for(int i=0; i<numbers.length-1;) {
			int j=i+1;
			while(numbers[i]==numbers[j]){
				if(j-i==1) {
					duplicateNumbers[index]=numbers[i];
					index++;
				}
				j++;
			}
			i=j;
		}
		return duplicateNumbers;

	}
	
	

}
