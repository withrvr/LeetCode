// arrays

// best logic ... of all ... mix/advance of file
// like b.java logic ... but using arrays logic of c.java ... not map

// Char stored as (ascii val/no.)
// 'z' - 'a' == 25 --> 122 - 97
// 'a' - 'a' == 0  --> 97  - 97

// To Code   : 15m 0s
// Execution : 2 ms
// Time complexity  : O(2*n) // Sorting both string
// Space complexity : O(26)  // to store alphabet

class Solution {
	public boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		// from a(0) to z(25), ch count
		int[] freq = new int[26]; // alphabet_count

		// s1, alphabet_count
		for (char c : s1.toCharArray())
			freq[c - 'a']++; // increasing the ch val

		// checking for s2 if its true
		for (char c : s2.toCharArray())
			if (--freq[c - 'a'] < 0) // decreasing the ch val
				return false;

		return true;
	}
}