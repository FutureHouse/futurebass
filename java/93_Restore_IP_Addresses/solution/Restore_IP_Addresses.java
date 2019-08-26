package solution;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {

	public static void main(String[] args) {
		String s = "010010";
		System.out.println(restoreIpAddresses(s));
	}

	public static List<String> restoreIpAddresses(String s) {
		if (s == null || s.length() < 4 || s.length() > 12)
			return new ArrayList<>();
		List<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		find(res, sb, s, 3);
		return res;
	}

	public static void find(List<String> res, StringBuilder sb, String s, int n) {
		if (n == 0) {
			if (s.charAt(0) == '0' && s.length() > 1)
				return;
			if (Integer.parseInt(s) <= 255) {
				res.add(sb.toString() + s);
			}
			return;
		}
		for (int i = 1; i <= 3; i++) {
			if (s.length() > i && s.length() - i <= 3 * n) {
				if (i == 3 && Integer.parseInt(s.substring(0, 3)) > 255)
					continue;
				String str = s.substring(0, i);
				if (i > 1 && str.charAt(0) == '0')
					break;
				sb.append(str + '.');
				find(res, sb, s.substring(i), n - 1);
				sb.delete(sb.length() - i - 1, sb.length());
			}
		}
	}

}
