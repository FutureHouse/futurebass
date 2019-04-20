package implement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Implement_strStr {

	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<>();
		maps.put("hello", "ll");
		maps.put("aaaa", "bba");
		maps.put("aaaaaaaaa", "aaa");
		Implement_strStr is = new Implement_strStr();
		Iterator<Map.Entry<String, String>> iterator = maps.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.print("haystack=:" + entry.getKey() + " needle=:" + entry.getValue());
			System.out.println(" result:" + is.strStr(entry.getKey(), entry.getValue()));
		}

	}

	public int strStr(String haystack, String needle) {
		// haystack = haystack.substring(haystack.indexOf(needle.indexOf(i)),
		// haystack.length());
		return haystack.indexOf(needle);// 。。。。。

	}
}
