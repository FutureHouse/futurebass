package reverseinteger;

public class Reverse_Integer {

	public static void main(String[] args) {
		
		int[] x = {0,123, -123, 120, 1534236469,-2147483412,-2147483648};
		Reverse_Integer ri = new Reverse_Integer();
		for(int i = 0; i < x.length; i++) {
			System.out.println("ans1=" +ri.reverse_1(x[i]));
		}
		for(int i = 0; i < x.length; i++) {
			System.out.println("ans2=" +ri.reverse_2(x[i]));
		}

	}
	 public int reverse_1(int x) {
		 
	        int result = 0,i = 0;
	        int xl = x;
	        while(xl != 0) {
	        	xl /= 10;
	        	i++;
	        }
	        for(; i != 0; i--) {
	        	xl = x % 10;
	        	if(Integer.MAX_VALUE/10 < Math.abs(result) || result == Integer.MAX_VALUE/10 && (x/10)%10 > 7 
	        			|| Math.abs(result) == Integer.MAX_VALUE / 10 && (x/10)%10 < -8)return 0;
	        	result +=  xl * Math.pow(10, i-2);
	        	x /= 10;
	        }

	        return result*10 + xl;

	}

	public int reverse_2(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;
	}
}
