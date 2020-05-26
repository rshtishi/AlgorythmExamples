package com.github.rshtishi.iterative.patterns;

public class Triangle {

	public static void printTopLeft(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printTopRight(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void printBottomLeft(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printBottomRight(int n) {
		for (int i = 0; i < n; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=n-i;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
