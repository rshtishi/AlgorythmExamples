package com.github.rshtishi.iterative;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		//setup
		int n = 5;
		//execute
		int factorialN = Factorial.compute(n);
		//verify
		int expected = 120;
		assertEquals(expected, factorialN);
	}

}
