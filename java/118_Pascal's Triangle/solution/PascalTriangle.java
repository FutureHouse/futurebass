package solution;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows = 3;
		System.out.print(generate(numRows));
	}

	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            li.add(0, 1);
            for(int j=1; j<li.size()-1; j++) {
                li.set(j, li.get(j)+li.get(j+1));
            }
            ans.add(new ArrayList<Integer>(li));
        }
        return ans;
	}
}
