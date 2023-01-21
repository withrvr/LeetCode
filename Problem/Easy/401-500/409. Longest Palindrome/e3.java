class Solution {
	public int longestPalindrome(String s) {
		int[] charCount = new int[128];

		for (char c : s.toCharArray())
			charCount[c]++;

		int res = 0;
		for (int count : charCount)
			// adding for all even times occurrence
			// and make odd - 1 == even ... then add it
			res += 2 * (count / 2);

		// if all even where there then
		// res and length will be same
		// else if any one odd came ... add one is res
		// because you have removed -1 in the loop
		return res == s.length() ? res : res + 1;
	}
}