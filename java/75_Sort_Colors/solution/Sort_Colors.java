package solution;

import java.util.Arrays;

public class Sort_Colors {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		System.out.print(Arrays.toString(nums));

	}

	public static void sortColors(int[] nums) {
		int zero = 0, one = 0;
		for (int i : nums) {
			zero += i == 0 ? 1 : 0;
			one += i == 1 ? 1 : 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i < zero) {
				nums[i] = 0;
			} else if (i < zero + one) {
				nums[i] = 1;
			} else {
				nums[i] = 2;
			}
		}
	}
}
