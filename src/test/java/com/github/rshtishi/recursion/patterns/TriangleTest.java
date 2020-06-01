package com.github.rshtishi.recursion.patterns;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testPrintTopLeft() {
		// setup
		int n = 3;
		// execute
		Triangle.printTopLeft(n);
		// verify
	}

	@Test
	public void testPrintTopRight() {
		// setup
		int n = 3;
		// execute
		Triangle.printTopRight(n, n);
		// verify
	}

	@Test
	public void testPrintBottomLeft() {
		// setup
		int n = 3;
		// execute
		Triangle.printBottomLeft(n);
		// verify
	}

	@Test
	public void testPrintBottomRight() {
		// setup
		int n = 3;
		// execute
		Triangle.printBottomRight(n, n);
		// verify
	}

	@Test
	public void testPrintTopIsosceles() {
		// setup
		int n = 3;
		// execute
		Triangle.printTopIsosceles(n, n);
		// verify
	}
	
	@Test
	public void printBottomIsosceles() {
		//setup
		int n = 3;
		//execute
		Triangle.printBottomIsosceles(n, n);
	}

}
