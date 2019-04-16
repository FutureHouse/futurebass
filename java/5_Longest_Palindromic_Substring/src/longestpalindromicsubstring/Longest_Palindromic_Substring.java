package longestpalindromicsubstring;

public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		String[] s = {"babad", "cbbd"};
		Longest_Palindromic_Substring spc = new Longest_Palindromic_Substring();
		for(int i=0; i < s.length; i++) {
			System.out.println(spc.longestPalindrome_1(s[i]) + "$$" +spc.longestPalindrome_2(s[i]));
		}
		
	}
	 public String longestPalindrome_1(String s) {
	        if(s == null || s.length() < 1) return "";
	        int start = 0, end =  0;
	        for(int i=0; i < s.length(); i++) {
	        	int len1 = expandAroundCenter(s, i, i);
	        	int len2 = expandAroundCenter(s, i, i+1);
	        	int len = Math.max(len1, len2);
	        	if(len > end -start) {
	        		start = i - (len - 1)/2;
	        		end = i + len/2;
	        	}
	        }
	        return s.substring(start, end + 1);
	        
	}
	 private int expandAroundCenter(String s, int left, int right) {
		 /**
		  * 
		  */
		 int L = left, R = right; 
		 while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			 L--;
			 R++;
		 }
		 return R-L+1-2;
	 }
	 public String longestPalindrome_2(String str){
		if (str == null || str.isEmpty()) {
			System.out.println("string invalid");
		}
		int length = str.length();
		StringBuilder sbBuilder = new StringBuilder("$#");
		for (int i = 0; i < length; i++) {
			sbBuilder.append(String.valueOf(str.charAt(i)));
			sbBuilder.append("#");
		}
		String str1 = sbBuilder.toString();
		System.out.println(str1);
		int[] p = new int[length];
		int mx = 0, id = 0, resLen = 0, resCenter = 0;
		for (int i = 1; i < length; i++) {
			p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;// 关键句，文中对这句以详细讲解
			while (i + p[i] < length && i - p[i] >= 0 && str1.charAt(i + p[i]) == str1.charAt(i - p[i])) {
				p[i] += 1;
			}
			if (p[i] + i > mx) {// 超过之前的最右端，则改变中心点和对应的最右端
				mx = p[i] + i;
				id = i;
			}
			if (resLen < p[i]) {// 更新最大回文串的长度，并记下此时的点
				resLen = p[i];
				resCenter = i;
			}
		}
		int start = (resCenter - resLen) / 2;
		return str.substring(start, start + resLen - 1);
	}
}
