package sqrt;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(3));

	}

	public static double mySqrt(int x) {
		// return Math.sqrt(x);
		if (x == 0)
			return 0;
		double last = 0;
		double res = 1;
		while (res != last) {
			last = res;
			res = (res + x / res) / 2;
		}
		return res;
	}
}
