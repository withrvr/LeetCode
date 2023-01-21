// if pair is formed
// increase count
// then remove it
// else ... add

// Execution : 4 / 5 / 6 ms

import java.util.HashSet;

class Solution {
	public int longestPalindrome(String s) {
		int count = 0;

		HashSet<Character> set = new HashSet<Character>();

		// for (char c : s.toCharArray()) {

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (set.contains(c)) {
				set.remove(c);
				count += 2;
			} else {
				set.add(c);
			}
		}

		return set.isEmpty() ? count : count + 1;

		// if (set.size() > 0)
		// count++;

		// return count;
	}
}
