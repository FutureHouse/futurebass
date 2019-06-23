package solution;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, { 16, 17, 18, 19 },
				{ 23, 30, 34, 50 } };
		int target[] = { 0, 2, 9, 15, 17, 24 };
		for (int t : target)
			System.out.println(searchMatrix(matrix, t));

	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0||matrix[0].length == 0)
			return false;
		int left = 0, right = (matrix.length)*(matrix[0].length)-1,mid=0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (matrix[mid/(matrix[0].length)][mid%(matrix[0].length)] > target) {
				right = mid - 1;
			} else if (matrix[mid/(matrix[0].length)][mid%(matrix[0].length)] < target) {
				left = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
