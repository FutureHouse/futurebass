package solution;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Subsets s = new Subsets();
		for(List<Integer> li : s.subsets(nums)) {
			System.out.println(li.toString());
		}
	}
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> li = new ArrayList<>();
	public List<List<Integer>> subsets(int[] nums) {
		find(nums,0);
		return result;
	}
	
	private void find(int[] nums,int index) {
		result.add(new ArrayList<>(li));
		for(int i =index;i<nums.length;i++) {
			li.add(nums[i]);
			find(nums,i+1);
			li.remove(li.size()-1);
		}
	}
}
