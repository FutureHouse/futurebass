package lengthoflastword;

public class Length_of_Last_Word {

	public static void main(String[] args) {
		String s = "  ";
		System.out.print(lengthOfLastWord(s));

	}

	public static int lengthOfLastWord(String s) {
		if ("".equals(s))
			return 0;
		s=s.trim();
		if(s.length()==0)return 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 32)
				return s.length() - i - 1;
		}
		return s.length();
	}

}
