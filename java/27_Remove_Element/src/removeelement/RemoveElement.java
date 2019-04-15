package removeelement;

import java.util.Arrays;

public class RemoveElement {
	/**
	 * Since question asked us to remove all elements of the given value in-place, we have to handle it with O(1)O(1)O(1) extra space. 
	 * How to solve it? We can keep two pointers i and j, where i is the slow-runner while j is the fast-runner.
	 */
	public static void main(String[] args) {
	
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		int val = 2;
		RemoveElement re = new RemoveElement();
		int range = re.removeElement(nums, val);
		System.out.print(Arrays.toString(Arrays.copyOf(nums, range)));
		
	}
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for(int j = 0; j < nums.length; j++) {
			if(val != nums[j]) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i; 
    }
}
