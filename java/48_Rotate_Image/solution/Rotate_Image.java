package solution;

import java.util.Arrays;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
						  { 5, 1, 9,11,19},
		                  { 2, 4, 8,10,20},
		                  {13, 3, 6, 7,21},
		                  {15,14,12,16,22},
		                  {51, 52, 53,54,55},
						};
		rotate(matrix);
		for(int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		
	}

	public static void rotate(int[][] matrix) {
		int len = matrix.length - 1;
		for (int i = 0; i <= len/2; i++) {
			int[] leftTop = { i, i }, leftBottom = { len-i, i }, rightTop = { i, len-i }, rightBottom = { len-i, len-i };
			for (int j = 0; j < len-2*i; j++) {
				int lt = matrix[leftTop[0]][leftTop[1]];
				int lb = matrix[leftBottom[0]][leftBottom[1]];
				int rt = matrix[rightTop[0]][rightTop[1]];
				int rb = matrix[rightBottom[0]][rightBottom[1]];
				matrix[leftBottom[0]--][leftBottom[1]] = rb;
				matrix[rightBottom[0]][rightBottom[1]--] = rt;
				matrix[leftTop[0]][leftTop[1]++] = lb;
				matrix[rightTop[0]++][rightTop[1]] = lt;
			}
		}
	}
}
