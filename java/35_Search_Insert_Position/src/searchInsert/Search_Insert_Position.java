package searchInsert;

public class Search_Insert_Position {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target=2;
		Search_Insert_Position sip = new Search_Insert_Position();
		System.out.println(sip.searchInsert(nums, target));
	}

	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;

	}

}
