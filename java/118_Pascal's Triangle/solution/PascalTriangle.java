package solution;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		System.out.print(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<>() {
			{
				add(1);
			}
		});
		if(numRows==1)return res;
		
		return res;
	}
}
