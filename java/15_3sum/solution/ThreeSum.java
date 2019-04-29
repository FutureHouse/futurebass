package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4, 1, 1, 1 };
		System.out.print(threeSum(nums).toString());
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3)
			return new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		List<List<Integer>> li = new ArrayList<>();
		int len = nums.length - 1;
		int left = 0, right = len;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (i > 0 && nums[i - 1] == nums[i])
				continue;
			left = i + 1;
			right = len;
			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];
				System.out.println("i=" + i + "left=" + left + "right=" + right + "sum=" + sum);
				if (sum == 0) {
					li.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1])
						left++;
					while (left < right && nums[right] == nums[right + 1])
						right--;
				} else if (sum > 0) {
					right--;
				} else {
					left++;
				}
			}
		}
		return li;
	}
}
