package com.github.rshtishi.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorial() {
		//setup
		int n = 5;
		//execute
		int factorialN = Factorial.factorial(n);
		//verify
		int expected = 120;
		assertEquals(expected, factorialN);
	}

}
