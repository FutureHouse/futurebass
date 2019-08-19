package solution;

import java.util.Arrays;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'B', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		System.out.print(exist(board, word));
	}

	public static boolean exist(char[][] board, String word) {
		if (word.length() == 0)
			return false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (find(board, i, j, 0, word))
					return true;
			}
		}
		return false;
	}

	public static boolean find(char[][] board, int x, int y, int index, String word) {
		if (index == word.length()) {
			return true;
		} else if (x > board.length - 1 || y > board[0].length - 1 || x < 0 || y < 0) {
			return false;
		} else if (board[x][y] == word.charAt(index)) {
			char curr = board[x][y];
			board[x][y] = '#';
			for (char[] b : board)
				System.out.println(Arrays.toString(b));
			if (find(board, x + 1, y, index + 1, word))
				return true;
			if (find(board, x, y + 1, index + 1, word))
				return true;
			if (find(board, x - 1, y, index + 1, word))
				return true;
			if (find(board, x, y - 1, index + 1, word))
				return true;
			board[x][y] = curr;
		}
		return false;
	}
}
