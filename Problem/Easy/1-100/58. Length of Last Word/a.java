// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int lengthOfLastWord(String s) {
		int word_len = 0;
		boolean start = false;

		for (int i = s.length() - 1; i > -1; --i) {
			if (s.charAt(i) != ' ') {
				word_len++;
				start = true;
			} else if (start == true) {
				return word_len;
			}
		}

		return word_len;
	}
}
