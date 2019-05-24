package solution;

import java.util.HashSet;

public class Valid_Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
						{'5','3','.','.','7','.','.','.','.'},
						{'6','.','.','1','9','5','.','.','.'},
						{'.','9','8','.','.','.','.','6','.'},
		                {'8','.','.','.','6','.','.','.','3'},
		                {'4','.','.','8','.','3','.','.','1'},
		                {'7','.','.','.','2','.','.','.','6'},
		                {'.','6','.','.','.','.','2','8','.'},
		                {'.','.','.','4','1','9','.','.','5'},
		                {'.','.','.','.','8','.','.','7','9'}
		                 };
		System.out.print(isValidSudoku(board));
	}

	public static boolean isValidSudoku(char[][] board) {
		for(int i =0;i<9;i++) {
			HashSet<Character> rows = new HashSet<Character>();
			HashSet<Character> columns = new HashSet<Character>();
			HashSet<Character> cube = new HashSet<Character>();	
			for(int j =0;j<9;j++) {
				if(board[i][j]!='.'&&!rows.add(board[i][j])) {
					return false;
				}
				if(board[j][i]!='.'&&!columns.add(board[j][i])){
					return false;
				}
				int cubeRow=i/3*3+j/3,cubeCol=i%3*3+j%3;
				if(board[cubeRow][cubeCol]!='.'&&!cube.add(board[cubeRow][cubeCol])){
					return false;
				}
			}
		}
		return true;
	}
}
