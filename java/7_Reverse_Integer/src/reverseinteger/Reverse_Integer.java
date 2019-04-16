package reverseinteger;

public class Reverse_Integer {

	public static void main(String[] args) {
		
		int[] x = {0,123, -123, 120, 1534236469,-2147483412,-2147483648};
		Reverse_Integer ri = new Reverse_Integer();
		for(int i = 0; i < x.length; i++) {
			System.out.println("ans=" +ri.reverse(x[i]));
		}

	}
	 public int reverse(int x) {
	        int result = 0,i = 0;
	        int xl = x;
	        while(xl != 0) {
	        	xl /= 10;
	        	i++;
	        }
	        for(; i != 0; i--) {
	        	xl = x % 10;
	        	System.out.print("xl="+xl);
	        	System.out.print("res="+result);
	        	if(Integer.MAX_VALUE/10 < Math.abs(result) || result == Integer.MAX_VALUE/10 && (x/10)%10 > 7 
	        			|| Math.abs(result) == Integer.MAX_VALUE / 10 && (x/10)%10 < -8)return 0;
	        	result +=  xl * Math.pow(10, i-2);
	        	x /= 10;
	        }

	        return result*10 + xl;
	        
	 }
}
