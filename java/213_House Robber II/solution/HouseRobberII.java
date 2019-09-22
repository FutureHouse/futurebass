package solution;

public class HouseRobberII {

	public static void main(String[] args) {
		int[] nums = { 2,3,2 };
		System.out.print(rob(nums));
	}

	public static int rob(int[] nums) {
		int len = nums.length;
		if (len == 0)
			return 0;
		if (len == 1)
			return nums[0];
		int[] f1 = new int[len];
		int[] f2 = new int[len];
		f1[0] = nums[0];
		f1[1] = Math.max(nums[0], nums[1]);
		f2[0] = 0;
		f2[1] = nums[1];
		for (int i = 2; i < len - 1; i++) {
			f1[i] = Math.max(f1[i - 2] + nums[i], f1[i - 1]);
		}
		for (int i = 2; i < len; i++) {
			f2[i] = Math.max(f2[i - 2] + nums[i], f2[i - 1]);
		}
		
		return Math.max(f1[len - 2], f2[len - 1]);
	}
}
