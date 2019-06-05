package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 3 };
		PermutationsII per = new PermutationsII();
		System.out.println(per.permuteUnique(nums).toString());
	}

	public List<List<Integer>> permuteUnique(int[] nums)  {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> numsList = new ArrayList<>();
		List<Integer> resultLi = new ArrayList<>();
		for (int i : nums) {
			numsList.add(i);
		}
		find(result, numsList, resultLi);
		return result;
	}

	public void find(List<List<Integer>> result, List<Integer> numsList, List<Integer> resultLi) {
		if (numsList.isEmpty()) {
			result.add(resultLi);
			return;
		}
		
		for (int i = 0; i < numsList.size(); i++) {
			if (i>0 && numsList.get(i)==numsList.get(i-1)) continue;
			List<Integer> numsListNew = new ArrayList<>(numsList);
			List<Integer> resultLiNew = new ArrayList<>(resultLi);
			resultLiNew.add(numsListNew.get(i));
			numsListNew.remove(i);
			find(result, numsListNew, resultLiNew);
		}
	}
}
