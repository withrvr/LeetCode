class Solution {
	public int longestPalindrome(String s) {
		int[] count = new int[128];

		for (char c : s.toCharArray())
			count[c]++;

		int ans = 0;

		for (int v : count) {
			// add for all even
			// and make odd - 1 == even ... then add it
			ans += v / 2 * 2;

			// when ever first odd come ... add it
			// then ignore for other .... because ans val will be odd
			// since it added first odd
			if (ans % 2 == 0 && v % 2 == 1)
				ans++;
		}

		return ans;
	}
}