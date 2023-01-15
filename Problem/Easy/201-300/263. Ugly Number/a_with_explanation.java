// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println("\nAns:- " + s.isUgly(14)); // false
		System.out.println("\nAns:- " + s.isUgly(-12)); // false
		System.out.println("\nAns:- " + s.isUgly(0)); // false

		System.out.println("\nAns:- " + s.isUgly(6)); // true
		System.out.println("\nAns:- " + s.isUgly(1)); // true
		System.out.println("\nAns:- " + s.isUgly(900)); // true

	}
}

class Solution {
	public boolean isUgly(int n) {
		System.out.println("\nn: " + n);

		// if -ve or zero
		// for -ve no. also loop can handle
		// but added here to same time ... y need to run loop for no reason
		if (n <= 0)
			return false;

		// // special case ... but loop will handle automatically
		// if (n == 1)
		// return true;

		while (n != 1) { // n>1
			if (n % 2 == 0)
				n /= 2;
			else if (n % 3 == 0)
				n /= 3;
			else if (n % 5 == 0)
				n /= 5;
			else
				return false;

			System.out.println(n);
		}

		return true;
	}
}
