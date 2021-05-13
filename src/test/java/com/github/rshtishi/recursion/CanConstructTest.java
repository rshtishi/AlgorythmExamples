package com.github.rshtishi.recursion;

import static org.junit.Assert.*;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CanConstructTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestDate() {
		return new Object[] { new Object[] { "Rando", new String[] { "Ra", "do", "n", "Rand" }, true },
				new Object[] { "Rando", new String[] { "o", "do", "n", "Rand" }, true },
				new Object[] { "Tirana", new String[] { "Ti", "ran", "na", "rana" }, true },
				new Object[] { "Tirana", new String[] { "Tir", "rana", "na", "ir" }, false },
				new Object[] { "Rando", new String[] { "Ran", "and", "ndo" }, false } };

	}

	@Test
	@Parameters(method = "getTestDate")
	public void shouldComputeCorrect(String target, String[] wordBank, boolean expected) {
		boolean result = CanConstruct.compute(target, wordBank);
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForEmptyStrings() {
		boolean result = CanConstruct.compute("", new String[] { "a", "aa", "aab" });
		assertTrue(result);
	}

	@Test
	public void shouldComputeCorrectForBigString() {
		boolean result = CanConstruct.compute("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaax",
				new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaaa","aaaaaaaaaaaa" });
		assertFalse(result);
	}

}
