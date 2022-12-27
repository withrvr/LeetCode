// arrays

// Char stored as (ascii val/no.)
// 'z' - 'a' == 25 --> 122 - 97
// 'a' - 'a' == 0  --> 97  - 97

// To Code   : 15m 0s
// Execution : 3 ms
// Time complexity  : O(2*n) // Sorting both string
// Space complexity : O(26)  // to store alphabet

class Solution {
	public boolean isAnagram(String s1, String s2) {
		int n = s1.length();
		if (n != s2.length())
			return false;

		// from a(0) to z(25), ch count
		int[] alphabet_count = new int[26];

		for (int i = 0; i < n; i++) {
			alphabet_count[s1.charAt(i) - 'a']++; // increasing the ch val
			alphabet_count[s2.charAt(i) - 'a']--; // decreasing the ch val
		}

		// if all are zero
		for (int count : alphabet_count)
			if (count != 0)
				return false;

		return true;
	}
}
