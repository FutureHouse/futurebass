package solution;

public class Integer_to_Roman {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 9, 58, 1994 };
		for (int num : nums) {
			System.out.println(intToRoman(num));
		}
	}

	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		String[] symbol = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		for (int i = 0; num != 0; i++) {
			while (num >= value[i]) {
				num -= value[i];
				sb.append(symbol[i]);
			}
		}
		return sb.toString();
	}

}
