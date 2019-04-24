package climbingstairs;

public class Climbing_Stairs {

	public static void main(String[] args) {
		int[] n={2,3,5,7,9,36,44};
		for(int i=0;i<n.length;i++) {
			System.out.println(climbStairs(n[i]));
		}

	}
	public static int climbStairs(int n) {
	    if(n==1||n==2) return n;
	    int[] fib = {1,2};
	    int result =0;
	    for(int i=3;i<=n;i++) {
	    	result = fib[0]+fib[1];
	    	fib[0] = fib[1];
	    	fib[1]=result;
	    }
	    return result;
    }
}
