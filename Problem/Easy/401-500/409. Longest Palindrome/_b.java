// only code

import java.util.HashMap;

class Solution {
	public int longestPalindrome(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		int count = 0;
		boolean odd_came = false;

		for (int val : hm.values()) {
			if (val % 2 == 0) {
				count += val;
			} else {
				odd_came = true;
				count += (val - 1);
			}
		}

		return odd_came ? count + 1 : count;
	}
}
