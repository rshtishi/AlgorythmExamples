package com.github.rshtishi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MemoizationHowSumTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestData() {
		return new Object[] { new Object[] { 8, new int[] { 3, 5, 7, 8 }, Arrays.asList(5, 3) },
				new Object[] { 7, new int[] { 6, 4 }, null },
				new Object[] { 10, new int[] { 2, 3 }, Arrays.asList(2, 2, 2, 2, 2) },
				new Object[] { 9, new int[] { 8, 4, 6 }, null } };
	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrect(int num, int[] values, List<Integer> expected) {
		List<Integer> result =  MemoizationHowSum.compute(num, values, new HashMap<Integer,List<Integer>>());
		Assertions.assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void shouldComputeCorrectZeroNum() {
		int num =0;
		int[] values = new int[] {1,2,3,4};
		List<Integer> expected = new ArrayList<>();
		List<Integer> result = MemoizationHowSum.compute(num, values, new HashMap<Integer,List<Integer>>());
		Assertions.assertThat(result).isEqualTo(expected);
	}
	
	@Test 
	public void shouldComputeCorrectBigNum() {
		int num = 305;
		int[] values = {2,8,16};
		List<Integer> expected = null;
		List<Integer> result = MemoizationHowSum.compute(num, values, new HashMap<Integer,List<Integer>>());
		Assertions.assertThat(result).isEqualTo(expected);
	}


}
