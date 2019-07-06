package solution;

import java.util.Stack;

public class Basic_Calculator_II {

	public static void main(String[] args) {
		String s = "3+2*6-2";
		System.out.print(calculate(s));
	}

	public static int calculate(String s) {
		int result = 0, num = 0;
		char oper = '+';
		s += '+';
		Stack<Integer> nums = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				num = num * 10 + c - '0';
			} else if (c == '+' || c == '-' || c == '*' || c == '/') {
				if (oper == '+') {
					nums.push(num);
				} else if (oper == '-') {
					nums.push(-num);
				} else if (oper == '*') {
					nums.push(nums.pop() * num);
				} else {
					nums.push(nums.pop() / num);
				}
				oper = c;
				num = 0;
			}
		}
		for (int i : nums) {
			result += i;
		}
		return result;
	}
}
