package sti;

public class String_to_Integer {

	public static void main(String[] args) {
		String str = "-";
		System.out.print(myAtoi(str));
	}

	public static int myAtoi(String str) {
		str = str.trim();
		if("".equals(str))return 0;
		int type = 1, result = 0;
		if (str.charAt(0) == '-') {
			type = -1;
			str = str.substring(1);
		}else if (str.charAt(0) == '+'){
			str = str.substring(1);
		}
		if("".equals(str))return 0;
		for (int i = 0; i < str.length(); i++) {
			int s = str.charAt(i)-48;
			if (s > -1 && s < 10) {
				if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&s>=7))return Integer.MAX_VALUE;
				if(result<Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE/10&&s>=8))return Integer.MIN_VALUE;
				result *= 10;
				result += type==1?s:-s;
			} else {
				break;
			}
		}
		return result;
	}
}
