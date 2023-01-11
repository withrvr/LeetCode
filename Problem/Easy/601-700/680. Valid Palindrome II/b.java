// two pointer

// with using isDel variable

// To Code : 30 min
// Execution : 7 ms

// Time complexity: O(2 * n)
// Space complexity: O(1)

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		// int arr[] = new int[] { 44, 77, 99, 66, 22, 11, 44, 33 };
		System.out.println("Ans:- " + s.validPalindrome(
				"xx ece xx ec xx"));
	}
}

class Solution {
	private boolean isDel = false;

	public boolean isPalindrome(String s, int left, int right) {
		char l_ch, r_ch;

		System.out.println("---------------");

		while (left < right) {
			l_ch = s.charAt(left);
			r_ch = s.charAt(right);

			System.out.println(String.format("%d:%d, %c:%c", left, right, l_ch, r_ch));

			if (l_ch != r_ch) {
				if (this.isDel == true) // if one time del have happen
					return false;

				this.isDel = true;

				// seeing if using deletion can we move forward
				// return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
				return isPalindrome(s, left, right - 1) || isPalindrome(s, left + 1, right);
			}

			left++;
			right--;
		}

		return true;
	}

	public boolean validPalindrome(String s) {
		System.out.println(s + ", len: " + s.length() + "\n");

		return isPalindrome(s, 0, s.length() - 1);
	}
}
