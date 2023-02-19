class Solution {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			boolean[] used = new boolean[9];

			for (int j = 0; j < 9; j++) {
				char c = board[i][j];

				if (c != '.') {
					int idx = c - '1';

					if (used[idx]) {
						return false;
					}

					used[idx] = true;
				}
			}
		}

		// Check each column
		for (int j = 0; j < 9; j++) {
			boolean[] used = new boolean[9];

			for (int i = 0; i < 9; i++) {
				char c = board[i][j];

				if (c != '.') {
					int idx = c - '1';

					if (used[idx]) {
						return false;
					}

					used[idx] = true;
				}
			}
		}

		// Check each 3 x 3 sub-box
		for (int k = 0; k < 9; k++) {
			boolean[] used = new boolean[9];

			for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
				for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {

					char c = board[i][j];
					if (c != '.') {

						int idx = c - '1';
						if (used[idx]) {
							return false;

						}
						used[idx] = true;
					}
				}
			}
		}

		return true;
	}
}