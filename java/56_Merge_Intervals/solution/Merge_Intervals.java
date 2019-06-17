package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{ 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 }};
		for (int[] b : merge(intervals)) {
			System.out.println(Arrays.toString(b));
		}
	}

	public static int[][] merge(int[][] intervals) {
		quickSort(intervals, 0, intervals.length - 1);
		List<int[]> result = new ArrayList<>();
		for (int[] num : intervals) {
			int last = result.size()-1;
			if (result.isEmpty() || result.get(last)[1] < num[0]) {
				result.add(num);
            }
            else {
            	result.get(last)[1] = Math.max(result.get(last)[1], num[1]);
            }
		}
		int[][] temp = new int[result.size()][];
		return result.toArray(temp);
	}

	public static void quickSort(int[][] intervals, int low, int high) {
		if (low > high) {
			return;
		}
		int[] pivot = intervals[low];
		int i = low, j = high;
		while (i < j) {
			while (pivot[0] <= intervals[j][0] && i < j) {
				j--;
			}
			while (pivot[0] >= intervals[i][0] && i < j) {
				i++;
			}
			if (i < j) {
				int[] temp = Arrays.copyOf(intervals[j], intervals[j].length);
				intervals[j] = intervals[i];
				intervals[i] = temp;
			}
		}
		intervals[low] = intervals[i];
		intervals[i] = pivot;
		quickSort(intervals, low, j-1);
		quickSort(intervals, j+1, high);
	}
}
