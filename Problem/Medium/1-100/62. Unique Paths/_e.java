// iterate
// small is store in n

// Time complexity: O(m*n)
// Space complexity: O(min(m, n))

class Solution {
	public int uniquePaths(int m, int n) {
		// // this will not work
		// use new variable if you want to do this
		// n = Math.min(m, n);
		// m = Math.max(m, n);

		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}

		int temp[] = new int[n];

		for (int i = 0; i < n; i++)
			temp[i] = 1;

		for (int i = 1; i < m; i++)
			for (int j = n - 2; j >= 0; j--)
				temp[j] += temp[j + 1];

		return temp[0];
	}
}
