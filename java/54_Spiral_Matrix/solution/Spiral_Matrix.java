package solution;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{ 5, 1, 9,11,19},
                { 2, 4, 8,10,20},
                {13, 3, 6, 7,21},
                {15,14,12,16,22},
                {51, 52, 53,54,55},
				};
		System.out.print(spiralOrder(matrix).toString());

	}
    public static List<Integer> spiralOrder(int[][] matrix) {
    	 List<Integer> ans = new ArrayList<>();
         if (matrix.length == 0)
             return ans;
         int r1 = 0, r2 = matrix.length - 1;
         int c1 = 0, c2 = matrix[0].length - 1;
         while (r1 <= r2 && c1 <= c2) {
             for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
             for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
             if (r1 < r2 && c1 < c2) {
                 for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                 for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
             }
             r1++;
             r2--;
             c1++;
             c2--;
         }
         return ans;
    }
}
