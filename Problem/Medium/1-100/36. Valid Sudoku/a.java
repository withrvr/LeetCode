
// To Code : 30 min
// Execution : 22 ms

// Time complexity: O(9*9) -> O(n*n) -> O(n^2)
// Space complexity: O(3*(n^2)) -> O(n^2)
// for each element 3 combination ... NOTE: half will be '.'

// logic: https://leetcode.com/problems/valid-sudoku/solutions/15472/short-simple-java-using-strings/
// Set ... for its position

// to check for / logic
// row -> val
// col -> val
// box -> val

// i: row No.
// j: col No.

// m: i/3 -> box row no
// n: j/3 -> box col no

// then add
// row : i(val)
// col : (val)j
// box : m(val)n

import java.util.Set;
import java.util.HashSet;

class Solution {
	public boolean isValidSudoku(char[][] board) {
		Set<String> pos = new HashSet<String>(); // position

		// 9: as board.length
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (board[i][j] != '.') {
					// covering it with ()
					// to make it look like val
					// and both collapse with other row/col val
					String val = "(" + board[i][j] + ")";

					// add return false .... if pos added was there before
					if (!pos.add(i + val) ||
							!pos.add(val + j) ||
							!pos.add(i / 3 + val + j / 3))
						return false;
				}

		return true;
	}
}
