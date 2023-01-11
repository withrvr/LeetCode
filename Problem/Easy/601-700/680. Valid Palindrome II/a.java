// two pointer

// To Code : 30 min
// Execution : - ms

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

// dont work for this examples

// xx cup xx pucu xx
// works if this condition is check first
// l_ch == s.charAt(right - 1)

// xx ece xx ec xx
// works if this condition is check first
// s.charAt(left + 1) == r_ch

class Solution {
	public boolean validPalindrome(String s) {
		System.out.println(s + ", len: " + s.length() + "\n");

		int left = 0, right = s.length() - 1;
		char l_ch, r_ch;
		boolean isDel = false;

		while (left < right) {
			l_ch = s.charAt(left);
			r_ch = s.charAt(right);

			System.out.println(String.format("%d:%d, %c:%c", left, right, l_ch, r_ch));

			if (l_ch == r_ch) {
				left++;
				right--;
			} else if (isDel == true) { // if one time del have happen
				return false;
			} else { // seeing if using deletion can we move forward
				if (l_ch == s.charAt(right - 1)) {
					right--;
				} else if (s.charAt(left + 1) == r_ch) {
					left++;
				} else {
					return false;
				}
				System.out.println(String.format("---> %d:%d, %c:%c", left, right, s.charAt(left), s.charAt(right)));

				// common to do for both if
				left++;
				right--;
				isDel = true;
			}
		}

		// isPalindrome
		return true;
	}
}
