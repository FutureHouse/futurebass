package longestcommonprefix;

public class LongestCommonpreFix {
	
	public static void main(String[] args) {
		String[] strs = {"leets","leetcode","leet","leeds"};
		LongestCommonpreFix lcf = new LongestCommonpreFix();
		System.out.println(lcf.longestCommonPrefix_1(strs));
		System.out.println(lcf.longestCommonPrefix_2(strs));

	}

	public String longestCommonPrefix_1(String[] strs) {
		//runtime 1ms, 38.8MB memory used
		if (strs == null || strs.length == 0)
			return "";
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i == strs[j].length() || strs[j].charAt(i) != c)
					return strs[0].substring(0, i);
			}
		}
		return strs[0];
	}
	public String longestCommonPrefix_2(String[] strs) {
		//runtime 1ms, 38.8MB memory used
		if(strs == null) {
			return "";
		}
		String prefix = strs[0];
		for(int i = 0; i < strs.length; i++) {
			for( ;strs[i].indexOf(prefix) != 0 ;
					prefix = prefix.substring(0, prefix.length() - 1)) {
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

}
