// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(max(m, n)) ==> O(n)
// Space complexity: O(1) ... constant space to return res

class Solution {
	public String mergeAlternately(String word1, String word2) {
		StringBuffer ans = new StringBuffer();

		int len = Math.max(word1.length(), word2.length());

		for (int i = 0; i < len; i++) {
			if (i < word1.length())
				ans.append(word1.charAt(i));

			if (i < word2.length())
				ans.append(word2.charAt(i));
		}

		return ans.toString();
	}
}
