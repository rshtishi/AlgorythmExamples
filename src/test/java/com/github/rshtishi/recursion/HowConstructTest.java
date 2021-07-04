package com.github.rshtishi.recursion;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class HowConstructTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	public static final Object[] getTestData() {
		return new Object[] {
				new Object[] { "Rando", new String[] { "Ra", "do", "n", "Rand" }, Arrays.asList( "Ra", "n", "do" ) },
				new Object[] { "Rando", new String[] { "o", "do", "n", "Rand" }, Arrays.asList( "Rand", "o" ) },
				new Object[] { "Tirana", new String[] { "Ti", "ran", "na", "rana" }, Arrays.asList("Ti", "rana" ) },
				new Object[] { "Tirana", new String[] { "Tir", "rana", "na", "ir" }, null },
				new Object[] { "Rando", new String[] { "Ran", "and", "ndo" }, null } };

	}

	@Test
	@Parameters(method = "getTestData")
	public void test(String target, String[] wordBank,List<String> result) {
		System.out.println(HowConstruct.compute(target, wordBank));
	}

}
