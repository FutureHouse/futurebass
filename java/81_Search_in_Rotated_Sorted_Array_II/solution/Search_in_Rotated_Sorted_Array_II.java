package solution;

public class Search_in_Rotated_Sorted_Array_II {

	public static void main(String[] args) {
		int[] nums = { 1,1,3,1};
		int[] t = { 0,1,2,3,5,6 };
		for (int target : t)
			System.out.println(search(nums, target));
	}

	public static boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;           
            if(nums[mid] == target) return true;
            else if(nums[l] == nums[r]) l++;    
            else if(nums[l] <= nums[mid]) {      
                if(nums[l] <= target && target < nums[mid]) { 
                    r = mid - 1;
                } else {                                      
                    l = mid + 1;
                }
            } else if(nums[l] > nums[mid]) {
                if(nums[mid] < target && target <= nums[r]) {  
                    l = mid + 1;
                } else {                                      
                    r = mid - 1;
                }
            } 
        }
        return false;
	}
}
