package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.print(groupAnagrams(strs).toString());
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		 if (strs.length == 0) new ArrayList<>();
	        Map<String, List<String>> ans = new HashMap<>();
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String key = String.valueOf(ca);
	            if (!ans.containsKey(key)) ans.put(key, new ArrayList<>());
	            ans.get(key).add(s);
	        }
	        return new ArrayList<>(ans.values());
	}
}
