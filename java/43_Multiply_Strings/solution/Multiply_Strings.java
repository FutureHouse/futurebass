package solution;

public class Multiply_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "408";
		String num2 = "567";
		System.out.print(multiply(num1, num2));
	}

	public static String multiply(String num1, String num2) {
		if (num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty())
			return "";
		int len1 = num1.length() - 1, len2 = num2.length() - 1;
		int[] result = new int[len1 + len2 + 1];
		for (int i = len1; i >= 0; i--) {
			for (int j = len2; j >= 0; j--) {
				result[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = result.length - 1; i >= 1; i--) {
			result[i - 1] += result[i] / 10;
			result[i] %= 10;
			sb.insert(0, result[i]);
		}
		sb.insert(0, result[0]);
		return sb.charAt(0) == '0' ? "0" : sb.toString();
	}
}
