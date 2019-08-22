package solution;

import java.util.ArrayList;
import java.util.List;

public class Subsets_II {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		System.out.print(subsetsWithDup(nums));

	}
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> li =  new ArrayList<>();
        find(nums,0,li, result);
        return result;
    }
    
    public static void find(int[] nums,int index,List<Integer> li, List<List<Integer>> result){
    	for(int i=index;i<nums.length;i++) {
    		li.add(nums[i]);
    		find(nums,index+1,li, result);
    		result.add(new ArrayList<>(li));
    		li.clear();
    		
    	}
    }
}
