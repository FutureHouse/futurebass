package mergesorted;

import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = {1,1,2,3,5,0,0,0,0,0,0};
		int m = 5;
		int[] nums2 = {1,1,3,4,5,6};
		int n = 6;
		merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int index = m + n - 1, len1 = m - 1, len2 = n - 1;
		while (len1 >= 0 && len2 >= 0) {
			if (nums1[len1] > nums2[len2]) {
				nums1[index] = nums1[len1];
				len1--;
			} else {
				nums1[index] = nums2[len2];
				len2--;
			}

			index--;
		}

		while (len2 >= 0) {
			nums1[index] = nums2[len2];
			len2--;
			index--;
		}
	}
}
