// array as dict/hashmap
// Execution : 5 ms

import java.util.Arrays;

class Solution {
	public boolean isIsomorphic(String s, String t) {
		// since value are only
		// any valid ascii character.
		int[] dict_s = new int[256];
		int[] dict_t = new int[256];

		Arrays.fill(dict_s, -1);
		Arrays.fill(dict_t, -1);

		for (int i = 0; i < s.length(); ++i) {
			char ch_s = s.charAt(i);
			char ch_t = t.charAt(i);

			if (dict_t[ch_s] == -1 && dict_s[ch_t] == -1) {
				dict_t[ch_s] = ch_t;
				dict_s[ch_t] = ch_s;
			} else if (!(dict_t[ch_s] == ch_t && dict_s[ch_t] == ch_s)) {
				return false;
			}
		}

		return true;
	}
}