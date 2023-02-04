// To Code : 3 min
// Execution : 0 ms

// Time complexity: O(len(n))
// Space complexity: O(1)

class Solution {
	public int subtractProductAndSum(int n) {
		int sum = 0, mul = 1, dig;

		while (n > 0) {
			dig = n % 10;
			n /= 10;

			sum += dig;
			mul *= dig;
		}

		return mul - sum;
	}
}
