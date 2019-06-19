package solution;

public class Unique_Paths {

	public static void main(String[] args) {
		int m = 4, n = 4;
		System.out.print(uniquePaths(m, n));

	}

	public static int uniquePaths(int m, int n) {
		double result = 1.0,i = Math.max(m, n), j = 1.0, k = Math.min(m, n) - 1.0;
		while (j <= k)
			result *= i++ / j++;
		return (int) (result+0.5);
	}
}
