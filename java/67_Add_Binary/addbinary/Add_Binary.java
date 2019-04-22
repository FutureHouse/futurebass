package addbinary;

public class Add_Binary {

	public static void main(String[] args) {
		String a = "1010";
		String b = "11011";
		System.out.println(addBinary(a, b));

	}

	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0,sum=0;
		while (i >= 0 || j >= 0) {
			sum = carry;
			if (i >= 0 && a.charAt(i) == '1') {
				sum++;
			}
			if (j >= 0 && b.charAt(j) == '1') {
				sum++;
			}
			carry = sum > 1 ? 1 : 0;
			result.insert(0, (char) ((sum % 2) + 48));
			i--;
			j--;
		}
		if (carry == 1)
			result.insert(0, '1');
		return result.toString();
	}
}
