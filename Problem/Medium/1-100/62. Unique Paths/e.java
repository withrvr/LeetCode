// iterate

// Time complexity: O(m*n)
// Space complexity: O(n)

class Solution {
	public int uniquePaths(int m, int n) {
		int temp[] = new int[n];

		for (int i = 0; i < n; i++)
			temp[i] = 1;

		for (int i = 1; i < m; i++)
			for (int j = n - 2; j >= 0; j--)
				temp[j] += temp[j + 1];

		return temp[0];
	}
}
