package maximum;


public class Maximum_Subarray {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums1 = {4,-1,2};
		int[] nums2 = { -1 };
		Maximum_Subarray ms = new Maximum_Subarray();
		System.out.println(ms.maxSubArray(nums));
		System.out.println(ms.maxSubArray(nums1));
		System.out.println(ms.maxSubArray(nums2));

	}

	public int maxSubArray(int[] nums) {
        int max = nums[0];
        int dp_n = nums[0];
        for(int i=1; i<nums.length; i++){
            dp_n = nums[i] + (dp_n>0 ? dp_n : 0);
            max = dp_n>max ? dp_n : max;
        }
        return max;
    }

}
