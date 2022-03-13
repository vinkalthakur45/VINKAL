package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

public class add_two_2D_matrices_to_get_the_result_matrix {

	public static void main(String args[]) {

		int arrayA[][] = { { 1, 4, 3, 7 }, { 3, 9, 1, 2 } };
		int arrayB[][] = { { 3, 1, 8, 6 }, { 7, 2, 5, 8 } };
		int arrayC[][] = new int[2][4];

		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA[0].length; j++) {
				arrayC[i][j] = arrayA[i][j] + arrayB[i][j];

			}
		}

		for (int i = 0; i < arrayC.length; i++) {
			for (int x = 0; x < arrayC[i].length; x++) {
				System.out.print(arrayC[i][x] + "   ");
			}
			System.out.println();
		}
	}
}
