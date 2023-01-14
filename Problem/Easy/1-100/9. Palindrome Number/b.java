// reverse, pop numbers
// here numbers like 100 are handle automatically

// To Code : 5 min
// Execution : 9 ms

// Time complexity: O(n)
// Space complexity: O(1)

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		// System.out.println("\nAns:- " + s.isPalindrome(0));
		// System.out.println("\nAns:- " + s.isPalindrome(-11));
		// System.out.println("\nAns:- " + s.isPalindrome(2));
		// System.out.println("\nAns:- " + s.isPalindrome(65456));
		// System.out.println("\nAns:- " + s.isPalindrome(10));
		// System.out.println("\nAns:- " + s.isPalindrome(110011));
		System.out.println("\nAns:- " + s.isPalindrome(1230));
	}
}

class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int y = 0, new_x = x, r; // y: reverse, new_x: copy, r: reminder

		while (new_x > 0) {
			r = new_x % 10;
			y = y * 10 + r;
			new_x /= 10;
			System.out.println(y + ": " + new_x);
		}
		return x == y;
	}
}
