package com.github.rshtishi.iterative;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import com.github.rshtishi.recursion.CanConstruct;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TabulationCanConstructTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestData() {
		return new Object[] { new Object[] { "Rando", new String[] { "Ra", "do", "n", "Rand" }, true },
				new Object[] { "Rando", new String[] { "o", "do", "n", "Rand" }, true },
				new Object[] { "Tirana", new String[] { "Ti", "ran", "na", "rana" }, true },
				new Object[] { "Tirana", new String[] { "Tir", "rana", "na", "ir" }, false },
				new Object[] { "Rando", new String[] { "Ran", "and", "ndo" }, false } };

	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrect(String target, String[] wordBank, boolean expected) {
		boolean result = TabulationCanConstruct.compute(target, wordBank);
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForEmptyStrings() {
		boolean result = TabulationCanConstruct.compute("", new String[] { "a", "aa", "aab" });
		assertTrue(result);
	}

	@Test
	public void shouldComputeCorrectForBigString() {
		boolean result = TabulationCanConstruct.compute("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaax",
				new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaaa","aaaaaaaaaaaa" });
		assertFalse(result);
	}

}
