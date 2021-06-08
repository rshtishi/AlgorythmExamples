package com.github.rshtishi.recursion;

import java.util.HashMap;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MemoizationCountConstructTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestData() {
		return new Object[] { new Object[] { "Rando", new String[] { "Ra", "do", "n", "Rand" }, 1 },
				new Object[] { "Rando", new String[] { "o", "do", "n", "Rand" }, 1 },
				new Object[] { "Tirana", new String[] { "Ti", "ran", "na", "rana" }, 1 },
				new Object[] { "Tirana", new String[] { "Tir", "rana", "na", "ir" }, 0 },
				new Object[] { "Rando", new String[] { "Ran", "and", "ndo" }, 0 } };

	}

	@Test
	@Parameters(method = "getTestData")
	public void shouldComputeCorrect(String target, String[] wordBank, int expected) {
		int result = MemoizationCountConstruct.compute(target, wordBank, new HashMap<>());
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForEmptyStrings() {
		int result = MemoizationCountConstruct.compute("", new String[] { "a", "aa", "aab" }, new HashMap<>());
		int expected = 1;
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldComputeCorrectForBigStrings() {
		int result = MemoizationCountConstruct.compute("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaax",
				new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaaa", "aaaaaaaaaaaa" },
				new HashMap<>());
		int expected = 0;
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
