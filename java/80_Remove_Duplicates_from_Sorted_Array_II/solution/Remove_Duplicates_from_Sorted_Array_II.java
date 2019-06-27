package solution;

public class Remove_Duplicates_from_Sorted_Array_II {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,3,3,3};
		// nums is passed in by reference. (i.e., without making a copy)
		int len = removeDuplicates(nums);
		System.out.println(len);
		// any modification to nums in your function would be known by the caller.
		// using the length returned by your function, it prints the first len elements.
		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]);
		}
	}
	public static int removeDuplicates(int[] nums) {
		int len = 0;
		int index = 0;
		for(int i = 2;i<nums.length-len;i++) {
			if(nums[i]==nums[i-2]) {
			index++;
			}else if(index>0) {
				len+=index;
				i-=index;
				for(int j = i ;j<nums.length-len;j++) {
					nums[j]=nums[j+index];		
				}
				index=0;
			}
		}
        return nums.length -len-index;
    }
}
