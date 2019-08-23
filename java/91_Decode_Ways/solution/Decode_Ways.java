package solution;

public class Decode_Ways {

	public static void main(String[] args) {
		String s = "12121212321123";
		Decode_Ways dw = new Decode_Ways();
		System.out.println(dw.numDecodings(s));
	}

	public int numDecodings(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0') 
			return 0;
		int num = 1, pre = 1;
		char[] chs = s.toCharArray();
		for (int i = 1; i < chs.length; i++) {
			int temp = 0;
			if (chs[i] != '0')
				temp += num;
			int cur = (chs[i - 1] - '0') * 10 + chs[i] - '0';
			if (cur <= 26 && cur >= 10)
				temp += pre;
			pre = num;
			num = temp;
			System.out.println(num);
		}
		return num;
	}
}
