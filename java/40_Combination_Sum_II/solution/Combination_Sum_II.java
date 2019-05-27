package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {10,1,2,7,6,1,5,1,8,8,9,6,5,4,1 };
		int target = 8;
		Combination_Sum_II cs = new Combination_Sum_II();

		System.out.print(cs.combinationSum2(candidates, target).toString());
	}


	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }

    private void backtrack(int[] nums,int start,int remain,List<Integer> temp, List<List<Integer>> ans) {
        if (remain==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i]>remain) return;
            if (i>start && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(nums,i+1,remain-nums[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
