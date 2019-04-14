package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {2,1,11,7};
		int	target = 9;
		TwoSum twosum = new TwoSum();
		Solution solution = twosum.new Solution();
		int[] result = solution.twoSum_1(nums, target);
		System.out.println(Arrays.toString(result));
		result = solution.twoSum_2(nums, target);
		System.out.println(Arrays.toString(result));
	}
	class Solution{
		public int[] twoSum_1(int[] nums, int target) {
			//runtime 21ms, 38.5MB memory used
			/**
			 * Just the brute force approach.
			 */
			int[] result = new int[2];
			for(int i = 0; i < nums.length; i++) {
				for(int j = i + 1; j < nums.length; j++) {
					if(nums[i]+nums[j] == target) {
						result[0] = i;
						result[1] = j;
						return result;
					}
				}
			}
			throw new IllegalArgumentException("No two sum solution");
		}
		
		public int[] twoSum_2(int[] nums, int target) {
			//runtime 2ms, 39.3MB memory used
			/**
			 * Use a HashMap
			 */
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i = 0; i < nums.length; i++ ){
				int complement = target -nums[i];
				if ( map.containsKey(complement) ) {
					return new int[] {map.get(complement),i};
				}
				map.put(nums[i],i);
			}
			throw new IllegalArgumentException("No two sum solution");
		}

	}
}
