package com.github.rshtishi.iterative;

public class TabulationGridTraveler {

	public static long findNoRoutes(int rows, int cols) {
		if(rows==0 || cols==0) {
			return 0;
		}
		long[][] array = new long[rows + 1][cols + 1];
		array[1][1] = 1;
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= cols; j++) {
				long currValue = array[i][j];
				if (i < rows) {
					array[i + 1][j] += currValue;
				}
				if (j < cols) {
					array[i][j + 1] += currValue;

				}
			}

		}
		return array[rows][cols];
	}

}
