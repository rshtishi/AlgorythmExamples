package com.github.rshtishi.recursion;

import java.util.HashMap;

import org.fest.assertions.Assertions;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MemoizationFibonacciTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Ignore
	private static final Object[] getTestData() {
		return new Object[] { new Object[] { 1, 1 }, new Object[] { 2, 1 }, new Object[] { 3, 2 },
				new Object[] { 4, 3 }, new Object[] { 5, 5 }, new Object[] { 6, 8 }, new Object[] { 7, 13 } };
	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrectly(int n, int expected) {
		long computedValue = MemoizationFibonacci.compute(n, new HashMap<>());
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectyForZero() {
		int n = 0, expected = 0;
		long computedValue = MemoizationFibonacci.compute(n, new HashMap<>());
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}
	
	@Test
	public void shouldComputeCorrectlyBigN() {
		int n = 50;
		long expected = 12586269025L;
		long computedValue = MemoizationFibonacci.compute(n, new HashMap<>());
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}

}
