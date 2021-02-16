package com.github.rshtishi.iterative;

import static org.junit.Assert.fail;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import com.github.rshtishi.recursion.GridTraveler;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TabulationGridTravelerTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestData() {
		return new Object[] { new Object[] { 1, 1, 1 }, new Object[] { 2, 3, 3 }, new Object[] { 3, 2, 3 },
				new Object[] { 3, 3, 6 } };

	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldFindCorrectNoRoutes(int rows, int cols, int expected) {
		long result = TabulationGridTraveler.findNoRoutes(rows, cols);
		Assertions.assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void shouldFindTheCorrectNoRoutesForZeroRowsZeroCols() {
		int rows = 0, cols = 0, expected = 0;
		long result = TabulationGridTraveler.findNoRoutes(rows, cols);
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldFindTheCorrectNoRoutesForBigNoRowsCols() {
		int rows = 18, cols = 18;
		long expected = 2333606220L;
		long result = TabulationGridTraveler.findNoRoutes(rows, cols);
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
