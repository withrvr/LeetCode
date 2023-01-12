// pointer

// To Code : 5 min
// Execution : 1 ms

// Time complexity: O(len(t))
// Space complexity: O(1)

class Solution {
	public boolean isSubsequence(String s, String t) {

		if (s.length() > t.length())
			return false;
		else if (s.length() == 0)
			return true;

		int point = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(point) == t.charAt(i) && ++point == s.length())
				return true;
		}

		return false;
	}
}
