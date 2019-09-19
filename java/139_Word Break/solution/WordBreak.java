package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		String s = "catsandog";
		String[] words = { "cats", "dog", "sand", "and", "cat" };
		List<String> wordDict = new ArrayList<>(Arrays.asList(words));
		System.out.print(wordBreak(s, wordDict));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] f = new boolean[s.length() + 1];
		f[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if(f[j] && wordDict.contains(s.substring(j, i))) {
					f[i] = true;
					break;
				}
			}

		}
		return f[s.length()];
	}
}
