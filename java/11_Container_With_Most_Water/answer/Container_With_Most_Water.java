package answer;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.print(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int result = 0;
		while (left < right) {
			if (height[left] < height[right]) {
				int s = (right - left) * height[left];
				result = result > s ? result : s;
				left++;
			} else {
				int s = (right - left) * height[right];
				result = result > s ? result : s;
				right--;

			}
		}
		return result;
	}
}
