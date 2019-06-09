package solution;

import java.util.Arrays;

public class Spiral_Matrix_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for(int[] nums:generateMatrix(n)) {
			System.out.println(Arrays.toString(nums));
		}
	}

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		if (n <= 0) return result;
		 int r1 = 0, r2 = n - 1;
         int c1 = 0, c2 =n - 1;
         int i=1;
         while (r1 <= r2 && c1 <= c2) {
             for (int c = c1; c <= c2; c++) result[r1][c]=i++;
             for (int r = r1 + 1; r <= r2; r++) result[r][c2]=i++;
             for (int c = c2 - 1; c > c1; c--) result[r2][c]=i++;
             for (int r = r2; r > r1; r--) result[r][c1]=i++;
             r1++;
             r2--;
             c1++;
             c2--;
         }
		return result;
	}
}
