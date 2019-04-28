package solution;

import java.util.Arrays;

public class Three_Sum_Closest {

	public static void main(String[] args) {
		int[] nums = {1,2,4,8,16,32,64,128};
		int target = 82;
		System.out.print(threeSumClosest(nums, target));

	}

	public static int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3)
			return 0;
		Arrays.sort(nums);
		int len = nums.length - 1;
		int result = 0, sum = 0;
		int closeResult = Integer.MAX_VALUE;
		int left = 0, right = len;
		for (int i = 0; i < len; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			left = i + 1;
			right = len;
			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];
				if (sum < target) {
					left++;
				} else if (sum > target) {
					right--;
				} else {
					return sum;
				}
				if (Math.abs(sum - target) < closeResult) {
					closeResult = Math.abs(sum - target);
					result = sum;
				}
			}

		}
		return result;
	}

}