// two pointer

// To Code : 15 min
// Execution : 3 ms

// letter and number are to be consider ... read question properly next time
// "0P" // expected: false

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		char l_ch, r_ch;

		while (left < right) {
			l_ch = s.charAt(left);
			r_ch = s.charAt(right);

			// System.out.println(String.format("%d : %d, %c : %c", left, right, l_ch,
			// r_ch));

			if (!Character.isLetterOrDigit(l_ch))
				left++;
			else if (!Character.isLetterOrDigit(r_ch))
				right--;
			else if (Character.toLowerCase(l_ch) == Character.toLowerCase(r_ch)) {
				left++;
				right--;
			} else
				return false;
		}

		// isPalindrome
		return true;
	}
}
