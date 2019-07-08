package solution;

import java.util.Stack;

public class Basic_Calculator {

	public static void main(String[] args) {
		String s = "(6+1)-(10+(5-5))";
		System.out.print(calculate(s));

	}

	public static int calculate(String s) {
		int result = 0, num = 0,sign = 1;
		Stack<Integer> nums = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				num = num * 10 + c - '0';
			} else if (c == '+') {
				result += sign * num;
				sign = 1;
				num = 0;
			} else if (c == '-') {
				result += sign * num;
				sign = -1;
				num = 0;
			} else if (c == '(') {
				nums.push(result);
				nums.push(sign);
				sign =1;
				result = 0;
			} else if (c == ')') {
				result += num * sign;
				result *= nums.pop();
				result += nums.pop();
				num = 0;
			}
		}
		return result + (sign * num);
	}

}
