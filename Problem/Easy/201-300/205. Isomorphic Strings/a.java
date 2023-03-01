// only code
// https://leetcode.com/problems/isomorphic-strings/submissions/879806878/

// hashmap

// if last time occurs was same
// for both s and t

// false
// badc
// baba

// To Code : 5 min
// Execution : 7 ms

// Time complexity: O(n)
// Space complexity: O(2n) --> O(n) ... hashmap

import java.util.HashMap;

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		// System.out.println(String.format("\nAns:- %b \n", s.isIsomorphic("egg",
		// "add")));
		System.out.println(String.format("\nAns:- %b \n", s.isIsomorphic("badc", "baba")));
		// System.out.println(s.isIsomorphic("foo", "bar"));
	}
}

class Solution {
	public boolean isIsomorphic(String s, String t) {
		// base case ... but no need to handle
		// if (s == null && t == null)
		// return true;
		// if (s == null || t == null)
		// return false;
		// if (t.length() != s.length())
		// return false;

		HashMap<Character, Character> hm_s = new HashMap<>();
		HashMap<Character, Character> hm_t = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			Character ch_s = s.charAt(i);
			Character ch_t = t.charAt(i);

			Character get_s = hm_s.get(ch_s);
			Character get_t = hm_t.get(ch_t);

			System.out.println(String.format("i: %2d ... %c:%c,  %c:%c", i, ch_s, ch_t, get_s, get_t));

			// Case 1: No mapping exists in either of the dictionaries
			if (get_s == null && get_t == null) {
				hm_s.put(ch_s, ch_t);
				hm_t.put(ch_t, ch_s);
			}
			// Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping
			// exists and
			// it doesn't match in either of the dictionaries or both
			else if (ch_s != get_t || ch_t != get_s) {
				return false;
			}
		}

		return true;
	}
}
