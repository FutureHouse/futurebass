package solution;

import java.util.Arrays;

public class Set_Matrix_Zeroes {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2, 1 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		setZeroes(matrix);
		for (int[] nums : matrix) {
			System.out.println(Arrays.toString(nums));
		}
	}

	public static void setZeroes(int[][] matrix) {
		int col = matrix.length - 1, row = matrix[0].length - 1;
		boolean colz = false, rowz = false;
		for (int i = 0; i <= col; i++) {
			if (matrix[i][0] == 0)
				colz = true;
		}
		for (int i = 0; i <= row; i++) {
			if (matrix[0][i] == 0)
				rowz = true;
		}
		for (int i = 0; i <= col; i++) {
			for (int j = 0; j <= row; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i <= col; i++) {
			for (int j = 1; j <= row; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (colz) {
			for (int i = 0; i <= col; i++) {
				matrix[i][0] = 0;
			}
		}
		if (rowz) {
			for (int i = 0; i <= row; i++) {
				matrix[0][i] = 0;
			}
		}
	}
}
