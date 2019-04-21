package plasone;

import java.util.Arrays;

public class Plus_One {

	public static void main(String[] args) {
		int[] digits1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] digits2 = { 9 };
		int[] digits3 = { 9, 9, 9, 9 };
		System.out.println(Arrays.toString(plusOne(digits1)));
		System.out.println(Arrays.toString(plusOne(digits2)));
		System.out.println(Arrays.toString(plusOne(digits3)));

	}

	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;

	}
}
