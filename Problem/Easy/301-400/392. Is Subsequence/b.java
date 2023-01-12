// pointer

// To Code : 5 min
// Execution : 2 ms

// Time complexity: O(len(t))
// Space complexity: O(1)

class Solution {
	public boolean isSubsequence(String s, String t) {
		if (s.length() > t.length())
			return false;
		else if (s.length() == 0)
			return true;

		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s.length();
	}
}
