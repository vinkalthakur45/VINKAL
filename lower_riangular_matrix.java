package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

import java.util.*;

public class lower_riangular_matrix {
	static void lowerTriangularMatrix(int matrix[][]) {
		int row = matrix.length;
		int col = matrix[0].length;
		if (row != col) {
			System.out.println("Matrix: ");
			return;
		} else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i < j) {
						matrix[i][j] = 0;
					}
				}
			}

			System.out.println("Lower Triangular Matrix: ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int mat[][] = { { 2, 5, 9 }, { 3, 6, 4 }, { 5, 7, 8 } };
		lowerTriangularMatrix(mat);
	}
}
