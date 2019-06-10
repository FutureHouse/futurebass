package solution;

public class Jump_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		System.out.print(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
	    int reachable = 0;
	    for (int i=0; i<nums.length; ++i) {
	        if (i > reachable) return false;
	        reachable = Math.max(reachable, i + nums[i]);
	    }
	    return true;
    }
}
