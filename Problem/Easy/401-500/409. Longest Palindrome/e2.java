// how e.java ... logic actually work

class Solution {
	public int longestPalindrome(String s) {
		int[] count = new int[128];

		for (char c : s.toCharArray())
			count[c]++;

		int ans = 0;
		boolean odd_came = false;

		for (int v : count) {
			// add for all even
			// and make odd - 1 == even ... then add it
			ans += v / 2 * 2;

			if (v % 2 == 1)
				odd_came = true;
		}

		return odd_came ? ans + 1 : ans;
	}
}