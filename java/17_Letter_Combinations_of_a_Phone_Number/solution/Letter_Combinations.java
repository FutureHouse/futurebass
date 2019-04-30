package solution;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations {

	public static void main(String[] args) {
		String digits = "233";
		System.out.println(letterCombinations(digits).toString());

	}

	private static char[][] map = new char[][] { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
			{ 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

	public static List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<>();
		}
		List<String> li = new ArrayList<>();
		List<String> result = new ArrayList<>();
		result.add("");
		char[] input = digits.toCharArray();
		for (char ch : input) {
			for (String s : result) {
				for (char c : map[ch - '2']) {
					li.add(s + c);
				}
			}
			result = new ArrayList<>(li);
			li.clear();
		}

		return result;
	}
}
