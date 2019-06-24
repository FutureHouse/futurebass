package solution;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static void main(String[] args) {
		int n = 5, k = 4;
		Combinations c = new Combinations();
		for (List<Integer> li : c.combine(n, k))
			System.out.println(li.toString());
	}

	List<List<Integer>> result = new ArrayList<>();
	List<Integer> li = new ArrayList<>();

	public List<List<Integer>> combine(int n, int k) {
		find(n, k);
		return result;
	}

	public void find(int n, int k) {
		if (0 == k) {
			result.add(new ArrayList<Integer>(li));
			return;
		}
		for (int i = n; i >= k; i--) {
			li.add(i);
			find(i - 1, k - 1);
			li.remove(li.size() - 1);
		}
	}
}
