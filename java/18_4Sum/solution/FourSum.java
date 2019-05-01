package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		System.out.println(fourSum(nums, target).toString());

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums.length < 4) {
			return result;
		}
		Arrays.sort(nums);
		int sum = 0;
		int len = nums.length - 1;
		int left = 0, right = len;
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && nums[i - 1] == nums[i])
				continue;
			for (int j = i + 1; j < len - 1; j++) {
				if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)break;
				if (nums[i] + nums[j] + nums[len] + nums[len-1] < target) continue;
				if (j > i + 1 && nums[j - 1] == nums[j])
					continue;
				left = j + 1;
				right = len;
				while (left < right) {
					sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						while (left < right && nums[left] == nums[left + 1])
							left++;
						while (left < right && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
		return result;
	}
}
