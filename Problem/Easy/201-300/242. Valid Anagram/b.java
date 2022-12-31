// maps

// create HM of first s1, alphabet: its_count
// then check from s2 while traversing

// To Code : 10m 0s
// Execution : 9 ms
// Time complexity  : O(2*n)       // Sorting both string
// Space complexity : O(n) // to store hm of s1

import java.util.HashMap;

class Solution {
	public boolean isAnagram(String s1, String s2) {
		int n = s1.length();
		if (n != s2.length())
			return false;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// hm for s1, alphabet: count
		for (int i = 0; i < n; i++) {
			Character ch = s1.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		// checking for s2 if its true
		for (int i = 0; i < n; i++) {
			Character ch = s2.charAt(i);
			Integer count = hm.get(ch);

			if (count == null || count < 1)
				return false;

			hm.put(ch, count - 1); // **** -1 count
		}

		return true;
	}
}
