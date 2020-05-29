package com.github.rshtishi.recursion.patterns;

public class Triangle {

	public static void printTopLeft(int n) {
		if (n > 1) {
			printTopLeft(n - 1);
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void printTopRight(int n, int index) {
		if (index > 1) {
			printTopRight(n, index - 1);
		}
		for (int i = n - index; i > 0; i--) {
			System.out.print(" ");
		}
		for (int i = 0; i < index; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void printBottomLeft(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		if (n > 1) {
			printBottomLeft(n - 1);
		}
	}

	public static void printBottomRight(int n, int index) {
		if (index > 1) {
			printBottomRight(n, index - 1);
		}
		for(int i=1;i<index;i++) {
			System.out.print(" ");
		}
		for (int i = 0; i <= n - index; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printTopIsosceles(int n, int index) {
		if (index > 1) {
			printBottomRight(n, index - 1);
		}
		
	}

}
