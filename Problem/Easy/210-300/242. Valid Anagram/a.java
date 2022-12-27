// sorting

// if both same then after sorting

// To Code : 5m 0s
// Execution : 3 ms
// Time complexity  : O(n*log(n) + m*log(m)) // Sorting both string
// Space complexity : O(1)                   // O(n), in java, to convert in char arr and store

import java.util.Arrays;

class Solution {
	public boolean isAnagram(String s1, String s2) {
		// checking len is not v.imp here
		// but if checked thats very good for algorithm
		if (s1.length() != s2.length())
			return false;

		char[] chars;

		// sorting s1
		chars = s1.toCharArray();
		Arrays.sort(chars);
		s1 = new String(chars);

		// sorting s2
		chars = s2.toCharArray();
		Arrays.sort(chars);
		s2 = new String(chars);

		// if both string are same
		return s1.compareTo(s2) == 0;
	}
}
