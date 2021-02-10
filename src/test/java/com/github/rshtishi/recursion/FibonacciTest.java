package com.github.rshtishi.recursion;

import org.fest.assertions.Assertions;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.model.TestTimedOutException;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Ignore
	private static final Object[] getTestData() {
		return new Object[] { new Object[] { 1, 1 }, new Object[] { 2, 1 }, new Object[] { 3, 2 },
				new Object[] { 4, 3 }, new Object[] { 5, 5 }, new Object[] { 6, 8 }, new Object[] { 7, 13 } };
	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrectFibonacciValue(int n, int expected) {
		int computedValue = Fibonacci.compute(n);
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForZero() {
		int n = 0;
		int expected = 0;
		int computedValue = Fibonacci.compute(n);
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForBigN() {
		int n = 200;
		int computedValue = Fibonacci.compute(n);
		System.out.println(computedValue);
	}

}
