// m+n
// since we are using
// k++ on both if

// 0 ms

class Solution {
	public String mergeAlternately(String word1, String word2) {
		int i = 0, j = 0, k = 0;
		int m = word1.length(), n = word2.length();

		char[] res = new char[m + n];

		while (k < m + n) {
			if (i < m)
				res[k++] = word1.charAt(i++);

			if (j < n)
				res[k++] = word2.charAt(j++);
		}

		return new String(res);
	}
}