package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets_II {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2 };
		System.out.print(subsetsWithDup(nums));

	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		find(nums, 0, new ArrayList<Integer>(), result);
		return result;
	}

	public static void find(int[] nums, int index, List<Integer> li, List<List<Integer>> result) {
		result.add(new ArrayList<>(li));
		for (int i = index; i < nums.length; i++) {
			li.add(nums[i]);
			find(nums, i + 1, li, result);
			li.remove(li.size() - 1);
			while (i + 1 < nums.length && nums[i + 1] == nums[i])
				i++;
		}

	}
}
