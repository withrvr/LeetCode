// https://leetcode.com/problems/palindrome-number/solutions/127661/palindrome-number/

// reverse, pop numbers
// but half only
// no need or remainder variable and new_x also

// To Code : 5 min
// Execution : ? ms

// Time complexity: O(n/2)
// Space complexity: O(1)

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		// System.out.println("\nAns:- " + s.isPalindrome(0));
		// System.out.println("\nAns:- " + s.isPalindrome(-11));
		// System.out.println("\nAns:- " + s.isPalindrome(2));
		// System.out.println("\nAns:- " + s.isPalindrome(44));
		// System.out.println("\nAns:- " + s.isPalindrome(65456));
		// System.out.println("\nAns:- " + s.isPalindrome(100));
		// System.out.println("\nAns:- " + s.isPalindrome(1100));
		System.out.println("\nAns:- " + s.isPalindrome(1102002011));
	}
}

class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0))
			return false;

		// no need of new_x: copy, r: reminder
		int y = 0; // y: reverse

		System.out.println(x + " : " + y);

		while (x > y) {
			y = y * 10 + x % 10;
			x /= 10;
			System.out.println(x + " : " + y);
		}

		// 2nd one if odd digit number
		return x == y || x == y / 10;
	}
}
