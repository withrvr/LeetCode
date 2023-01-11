// two pointer

// without using isDel variable

// To Code : 30 min
// Execution : 23 ms ... how ?? i don't know

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
	public boolean helper(String s, int left, int right) {
		System.out.println("---------------");

		while (++left < --right) {
			System.out.println(String.format("%d:%d, %c:%c", left, right, s.charAt(left), s.charAt(right)));

			// 2nd time del
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
		}

		return true;
	}

	public boolean validPalindrome(String s) {
		System.out.println(s + ", len: " + s.length() + "\n");
		int left = -1, right = s.length();

		while (++left < --right) {
			System.out.println(String.format("%d:%d, %c:%c", left, right, s.charAt(left), s.charAt(right)));

			// first time del
			if (s.charAt(left) != s.charAt(right)) {
				// return helper(s, left, right + 1) || helper(s, left - 1, right);
				return helper(s, left - 1, right) || helper(s, left, right + 1);
			}
		}

		return true;
	}
}
