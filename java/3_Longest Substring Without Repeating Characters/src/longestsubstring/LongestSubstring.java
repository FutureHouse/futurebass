package longestsubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String s = "pwwkew";
		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.lengthOfLongestSubstring_1(s));
		System.out.println(ls.lengthOfLongestSubstring_2(s));

	}
	public int lengthOfLongestSubstring_1(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while(i < n && j < n) {
			
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
				
			}else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
    }
	public int lengthOfLongestSubstring_2(String s) {

		int ans =0;
		Map<Character,Integer> map = new HashMap<>();
		for(int j = 0, i = 0; j < s.length(); j++) {
			if(map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
			
		}
		return ans;
	}
}
