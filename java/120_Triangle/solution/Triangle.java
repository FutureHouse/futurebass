package solution;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		int[][] nums = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		List<List<Integer>> triangle = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			List<Integer> tmp = new ArrayList<>();
			for (int j = 0; j < nums[i].length; j++) {
				tmp.add(nums[i][j]);
			}
			triangle.add(tmp);
		}
		System.out.println(minimumTotal(triangle));
	}

	public static int minimumTotal(List<List<Integer>> triangle) {
		int len = triangle.size();
		int[] dp = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (i == len - 1)
					dp[j] = triangle.get(i).get(j);
				else {
					dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
				}
			}
		}
		return dp[0];
	}

}
