package com.github.rshtishi.recursion;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MemoizationCanConstructTest {

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
		boolean result = MemoizationCanConstruct.compute(target, wordBank, new HashMap<>());
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForEmptyStrings() {
		boolean result = MemoizationCanConstruct.compute("", new String[] { "a", "aa", "aab" }, new HashMap<>());
		assertTrue(result);
	}

	@Test
	public void shouldComputeCorrectForBigString() {
		boolean result = MemoizationCanConstruct.compute("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaax",
				new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaaa","aaaaaaaaaaaa" },
				new HashMap<>());
		assertFalse(result);
	}

}
