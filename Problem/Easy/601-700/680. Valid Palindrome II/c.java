// two pointer
// with using isDel variable

// optimized solution for b.java
// not using diff statement for left inc, --right dec
// by tweaking left = -1, right = length

// good if in future mul del allowed
// instead of 1
// then convert isDel to count

// To Code : 30 min
// Execution : 7 ms

// Time complexity: O(2 * n)
// Space complexity: O(1)

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		// int arr[] = new int[] { 44, 77, 99, 66, 22, 11, 44, 33 };
		System.out.println("\nAns:- " + s.validPalindrome(
				"xx ece xx ec xx"));
	}
}

class Solution {
	private boolean isDel = false;

	public boolean isPalindrome(String s, int left, int right) {
		System.out.println("---------------");

		while (++left < --right) {
			System.out.println(String.format("%d:%d, %c:%c", left, right, s.charAt(left), s.charAt(right)));

			if (s.charAt(left) != s.charAt(right)) {
				if (this.isDel == true) // if one time del have happen
					return false;

				this.isDel = true;

				// return isPalindrome(s, left, right + 1) || isPalindrome(s, left - 1, right);
				return isPalindrome(s, left - 1, right) || isPalindrome(s, left, right + 1);
			}
		}

		return true;
	}

	public boolean validPalindrome(String s) {
		System.out.println(s + ", len: " + s.length() + "\n");

		return isPalindrome(s, -1, s.length());
	}
}
