package com.github.rshtishi.iterative;

import static org.junit.Assert.*;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class CanSumTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestData() {
		return new Object[] { new Object[] { 8, new int[] { 1, 3, 5, 7, 8 }, true },
				new Object[] { 7, new int[] { 6, 4 }, false }, new Object[] { 10, new int[] { 2, 3 }, true },
				new Object[] { 9, new int[] { 8, 4, 6 }, false } };
	}
	
	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrect(int num, int[] values, boolean expected) {
		boolean result = CanSum.compute(num, values);
		Assertions.assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void shouldComputeCorrectZeroNum() {
		int num =0;
		int[] values = new int[] {1,2,3,4};
		boolean expected = true;
		boolean result = CanSum.compute(num, values);
		Assertions.assertThat(result).isEqualTo(expected);
	}
	
	
	@Test
	public void shouldComputeCorrectBigNum() {
		int num = 80000;
		int[] values = new int[] {5, 3, 1, 2, 10} ;
		boolean expected = true;
		boolean result = CanSum.compute(num, values);
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
