// 💀: incorrect code

// it will only add the most highest odd no
// other will be ignored

// but we can use the others odd number by making it even
// by removing 1 from it

import java.util.HashMap;

class Solution {
	public int longestPalindrome(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		int max = 0;

		for (int val : hm.values()) {
			if (val % 2 == 0)
				count += val;
			else if (val > max) {
				count += (val - max);
				max = val;
			}
		}

		return count;
	}
}
