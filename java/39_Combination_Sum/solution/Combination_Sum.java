package solution;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7} ;
		int target = 7;
		Combination_Sum cs = new Combination_Sum();
	
		System.out.print(cs.combinationSum(candidates, target).toString());
	}

	List<List<Integer>> result = new ArrayList<>();
	ArrayList<Integer> li = new ArrayList<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		find(candidates, 0, target);
		return result;
	}

	private void find(int[] nums, int start, int target) {
		if (target == 0) {
			result.add(new ArrayList<>(li));
		} else if (target > 0) {
			for (int i = start; i < nums.length; i++) {
				li.add(nums[i]);
				find(nums, i, target - nums[i]);
				li.remove(li.size() - 1);
			}
		}
	}
}
