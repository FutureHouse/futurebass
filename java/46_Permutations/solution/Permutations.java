package solution;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		Permutations per = new Permutations();
		System.out.println(per.permute(nums).toString());
	}

	public List<List<Integer>> permute(int[] nums) {
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
		if(numsList.isEmpty()) {
			result.add(resultLi);
			return;
		}
		for(int i =0;i<numsList.size();i++) {
			List<Integer> numsListNew = new ArrayList<>(numsList);
			List<Integer> resultLiNew = new ArrayList<>(resultLi);
			resultLiNew.add(numsListNew.get(i));
			numsListNew.remove(i);
			find(result,numsListNew,resultLiNew);
		}
	}

}
