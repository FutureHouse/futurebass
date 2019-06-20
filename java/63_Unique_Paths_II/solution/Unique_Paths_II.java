package solution;

import java.util.Arrays;

public class Unique_Paths_II {

	public static void main(String[] args) {
		int m = 1, n = 2;
		int[][] obstacleGrid = new int[m][n];
		for (int[] row : obstacleGrid) {
			for (int i = 0; i < row.length; i++) {
				row[i] = 0;
			}
		}
		obstacleGrid[0][1] = 1;
		// obstacleGrid[1][0] = 1;
		System.out.print(uniquePathsWithObstacles(obstacleGrid));
	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid[0][0] == 1) {
			return 0;
		}
		obstacleGrid[0][0] = 1;
		int row = obstacleGrid[0].length, col = obstacleGrid.length;
		for (int i = 1; i < row; i++) {
			obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
		}
		for (int i = 1; i < col; i++) {
			obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
		}
		for (int i = 1; i < col; i++) {
			for (int j = 1; j < row; j++) {
				obstacleGrid[i][j] = obstacleGrid[i][j] == 1 ? 0 : obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
			}
		}
		return obstacleGrid[col - 1][row - 1];
	}
}
