package com.github.rshtishi.iterative;

import static org.junit.Assert.*;

import org.fest.assertions.Assertions;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import com.github.rshtishi.recursion.Fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TabulationFibonacciTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Ignore
	private static final Object[] getTestData() {
		return new Object[] { new Object[] { 1, 1 }, new Object[] { 2, 1 }, new Object[] { 3, 2 },
				new Object[] { 4, 3 }, new Object[] { 5, 5 }, new Object[] { 6, 8 }, new Object[] { 7, 13 } };
	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrectFibonacciValue(int n,int expected) {
		long computedValue = TabulationFibonacci.compute(n);
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}
	
	@Test
	public void shouldComputeCorrectForZero() {
		int n = 0;
		int expected = 0;
		long computedValue = Fibonacci.compute(n);
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForBigN() {
		int n = 50;
		long expected = 12586269025L;
		long computedValue = Fibonacci.compute(n);
		Assertions.assertThat(computedValue).isEqualTo(expected);
	}

}
