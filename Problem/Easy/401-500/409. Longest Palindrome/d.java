// same as c.java
// but counting at end

// Execution : 5 ms

import java.util.HashSet;

class Solution {
	public int longestPalindrome(String s) {
		HashSet<Character> set = new HashSet<>();

		for (char c : s.toCharArray()) {
			if (set.contains(c))
				set.remove(c);
			else
				set.add(c);
		}

		// all are even, at least only 1 odd pair
		if (set.size() <= 1)
			return s.length();

		// more than one odd pairs .... so removing other .. keeping only 1
		return s.length() - set.size() + 1;
	}
}
