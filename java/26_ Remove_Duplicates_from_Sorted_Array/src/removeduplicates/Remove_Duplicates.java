package removeduplicates;

import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		Remove_Duplicates rd = new Remove_Duplicates();
		System.out.println(rd.removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int i = 0, j = 0, count = 0;
		while (i < nums.length && j < nums.length) {
			if (nums[i] == nums[j]) {
				j++;
			} else {
				nums[count] = nums[j - 1];
				i = j++;
				count++;
			}
		}
		nums[count] = nums[j - 1];
		return ++count;
	}
}
