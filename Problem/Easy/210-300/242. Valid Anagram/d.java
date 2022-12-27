// hashmap

// same as c.java ... but using maps

// To Code   : 30 min
// Execution : 15 ms
// Time complexity  : O(2*n) // Sorting both string
// Space complexity : O(n)  // to store alphabet

import java.util.HashMap;

class Solution {
	public boolean isAnagram(String s1, String s2) {
		int n = s1.length();
		if (n != s2.length())
			return false;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// creating hm
		for (int i = 0; i < s1.length(); i++) {
			Character ch;

			// increasing the val of ch
			ch = s1.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);

			// decreasing the val of ch
			ch = s2.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) - 1);
		}

		// if all are zero
		for (HashMap.Entry<Character, Integer> ele : hm.entrySet()) {
			// for key: ele.getKey
			if (ele.getValue() != 0)
				return false;
		}

		return true;
	}
}
