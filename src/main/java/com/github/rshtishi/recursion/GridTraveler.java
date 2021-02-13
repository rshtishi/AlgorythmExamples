package com.github.rshtishi.recursion;

public class GridTraveler {

	public static long findNoRoutes(int rows, int cols) {
		if (rows == 1 && cols == 1) {
			return 1;
		}
		if (rows == 0 || cols == 0) {
			return 0;
		}
		return findNoRoutes(rows-1,cols)+ findNoRoutes(rows,cols-1);
	}
}
