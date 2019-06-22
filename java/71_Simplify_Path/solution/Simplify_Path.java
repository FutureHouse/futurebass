package solution;

import java.util.LinkedList;

public class Simplify_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/";
		System.out.print(simplifyPath(path));
	}

	public static String simplifyPath(String path) {
		String[] strs = path.split("/");
		StringBuilder sb = new StringBuilder();
		LinkedList<String> li = new LinkedList<>();
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].equals("") || strs[i].equals(".") || (strs[i].equals("..") && li.size() == 0)) {
				continue;
			} else if (strs[i].equals("..") && li.size() > 0) {
				li.pop();
			} else {
				li.push("/" + strs[i]);
			}
		}
		for (int i = li.size() - 1; i >= 0; i--) {
			sb.append(li.get(i));
		}
		return sb.length() > 0 ? sb.toString() : "/";
	}
}
