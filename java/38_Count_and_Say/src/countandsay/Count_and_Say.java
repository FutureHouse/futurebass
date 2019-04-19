package countandsay;

public class Count_and_Say {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("1211");
		Count_and_Say cas = new Count_and_Say();
		System.out.println(cas.count(str));
		System.out.print(cas.countAndSay(10));
	}

	public String countAndSay(int n) {
		StringBuilder str = new StringBuilder("1");
		for (int i = 1; i < n; i++) {
			str = count(str);
		}
		return str.toString();
	}

	private StringBuilder count(StringBuilder str) {
		int i = 0, j = 0;
		StringBuilder sBuilder = new StringBuilder();
		while (i < str.length() && j != str.length()) {
			if (str.charAt(i) == str.charAt(j)) {
				j++;
			} else {
				sBuilder.append(j - i);
				sBuilder.append(str.charAt(i));
				i = j;
			}
		}
		sBuilder.append(j - i);
		sBuilder.append(str.charAt(i));
		return sBuilder;
	}
}
