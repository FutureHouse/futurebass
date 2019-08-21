package solution;

import java.util.ArrayList;
import java.util.List;

public class Gray_Code {

	public static void main(String[] args) {
		int n = 0;
		
		
		System.out.print(grayCode(n));
	}

	public static List<Integer> grayCode(int n) {
		List<Integer> li = new ArrayList<>();
		for(int i = 0;i<1<<n;i++) {
			li.add(i^i>>1);
		}
		return li;
	}

}