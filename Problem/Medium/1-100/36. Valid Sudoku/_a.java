import java.util.HashSet;

class Solution {
	public boolean isValidSudoku(char[][] board) {
		HashSet<String> pos = new HashSet<String>();

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (board[i][j] != '.') {
					String val = "(" + board[i][j] + ")";

					if (!pos.add(i + val) || !pos.add(val + j) || !pos.add(i / 3 + val + j / 3))
						return false;
				}

		return true;
	}
}
