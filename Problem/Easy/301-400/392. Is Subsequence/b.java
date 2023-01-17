// pointer

// To Code : 5 min
// Execution : 2 ms

// Time complexity: O(len(t))
// Space complexity: O(1)

class Solution {
	public boolean isSubsequence(String s, String t) {

		// added extra cases
		// if not added then also will be handled by logic / loop
		if (s.length() > t.length())
			return false;
		else if (s.length() == 0)
			return true;

		int i = 0;
		int j = 0;

		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++; // if found go point to next s string character
			}
			j++; // traversing the t string
		}

		// if i traversed fully means subsequence is there
		return i == s.length();
	}
}
