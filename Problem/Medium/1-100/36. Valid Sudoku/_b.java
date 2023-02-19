// 2 ms

// NOTE:- can try this also
// num in which -> row/col
// new boolean[9][3][3]
// box[num][i / 3][j / 3]

class Solution {
	public boolean isValidSudoku(char[][] board) {
		boolean[][] row = new boolean[9][9];
		boolean[][] col = new boolean[9][9];
		boolean[][][] box = new boolean[3][3][9];

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (board[i][j] != '.') {
					int num = (int) board[i][j] - (int) '1'; // can use 1 direct here
					// int num = ((int) board[i][j] - (int) '0') - 1; // -1 to make it like a index

					if (row[i][num] || col[j][num] || box[i / 3][j / 3][num])
						return false;
					else {
						row[i][num] = true;
						col[j][num] = true;
						box[i / 3][j / 3][num] = true;
					}
				}

		return true;
	}
}
