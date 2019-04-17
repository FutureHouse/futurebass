package palindromenumber;

public class Palindrome_Number {

	public static void main(String[] args) {
		int[] x = {121, -121, 10};
		Palindrome_Number pn = new Palindrome_Number();
		for(int i = 0; i < x.length; i++) {
			System.out.println(pn.isPalindrome(x[i]));
		}

	}
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		int y = 0, temp = x;
        for(;x != 0;x /= 10) {
        	y *= 10;
        	y += x % 10;
        }
        return y == temp;
    }
}
