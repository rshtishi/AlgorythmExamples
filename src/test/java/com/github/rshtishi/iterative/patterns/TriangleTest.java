package com.github.rshtishi.iterative.patterns;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setup() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void testPrintTopLeft() {
		// setup
		int n = 3;
		String expected = "*\n**\n***\n";
		// execute
		Triangle.printTopLeft(n);
		// verify
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void testPrintTopRight() throws IOException {
		//setup
		int n = 3;
		String expected = "  *\n **\n***\n";
		// execute
		Triangle.printTopRight(n);
		// verify
		assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void testPrintBottomLeft() {
		//setup
		int n = 3;
		String expected = "***\n**\n*\n";
		//execute
		Triangle.printBottomLeft(n);
		//verify
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testPrintBottomRight() {
		//setup
		int n = 3;
		String expected = "***\n **\n  *\n";
		//execute
		Triangle.printBottomRight(n);
		//verify
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testPrintIsosceles() {
		//setup
		int n=3;
		String expected = "  *\n ***\n*****\n";
		//execute
		Triangle.printTopIsosceles(n);
		//verify
		assertEquals(expected,outContent.toString());
	}
	
	@Test
	public void testPrintBottomIsosceles() {
		//setup
		int n=3;
		String expected = "*****\n ***\n  *\n";
		//execute
		Triangle.printBottomIsosceles(n);
		//verify
		assertEquals(expected,outContent.toString());
	}


	@After
	public void tearDown() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

}
