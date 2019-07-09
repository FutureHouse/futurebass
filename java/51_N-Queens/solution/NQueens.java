package solution;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		NQueens nq = new NQueens();
		nq.solveNQueens(8);
		for(List<String> li : nq.result) {
			System.out.println(li.toString());
		}		
	}

	int max;
	int[] arr;
	char[] s;
	List<List<String>> result;
	
	public List<List<String>> solveNQueens(int n) {
		result = new ArrayList<>();
		max = n;
		arr = new int[n];
		s = new char[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = '.';
		}
		find(0);
		return result;
	}

	private void find(int n) {
		if (n == max) {
			List<String> li = new ArrayList<>();
			for (int i : arr) {
				s[i] = 'Q';
				li.add(new String(s));
				s[i] = '.';
			}
			result.add(li);
			return;
		}
		for (int i = 0; i < max; i++) {
			arr[n] = i;
			if (check(n)) {
				find(n + 1);
			}
		}
	}

	private boolean check(int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i]))
				return false;
		}
		return true;
	}
}
