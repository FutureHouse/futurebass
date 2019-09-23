package solution;

public class MaximalSquare {

	public static void main(String[] args) {
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		System.out.print(maximalSquare(matrix));

	}

	public static int maximalSquare(char[][] matrix) {
		if (!(matrix.length != 0 && matrix[0].length != 0))
			return 0;
		int[][] f = new int[matrix.length+1][matrix[0].length+1];
		int max = 0;
		for (int i = 1; i <= matrix.length; i++) {
			for (int j = 1; j <= matrix[0].length; j++) {
				if (matrix[i - 1][j - 1] == '1') {
					f[i][j] = Math.min(f[i - 1][j - 1], Math.min(f[i][j - 1], f[i - 1][j])) + 1;
					max = Math.max(max, f[i][j]);
				}

			}
		}

		return (int) Math.pow(max, 2);
	}
}
