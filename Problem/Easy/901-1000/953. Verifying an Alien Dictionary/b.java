// _a.java
// using arr
// as hashmap

class Solution {
	public boolean isAlienSorted(String[] words, String order) {
		// 26 == order.length() ... will be always ... in question
		int[] hm = new int[26];
		for (int i = 0; i < 26; i++)
			hm[order.charAt(i) - 'a'] = i;

		for (int i = 1; i < words.length; i++) {
			String a = words[i - 1];
			String b = words[i];

			boolean mid_break = false;

			for (int j = 0; j < a.length() && j < b.length(); j++) {
				Character a_ch = a.charAt(j);
				Character b_ch = b.charAt(j);

				if (a_ch != b_ch) {
					if (hm[a_ch - 'a'] > hm[b_ch - 'a']) {
						return false;
					} else {
						mid_break = true;
						break;
					}
				}
			}

			if (mid_break == false && a.length() > b.length())
				return false;
		}

		return true;
	}
}
