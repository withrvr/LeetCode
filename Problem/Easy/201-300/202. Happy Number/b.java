// 1 ms

// tc: O(n) ... but actually ... its log(n)
// sc: O(n)

import java.util.HashSet;
import java.util.Set;

class Solution {
	private int getNext(int n) {
		int totalSum = 0;

		while (n > 0) {
			int d = n % 10;
			n = n / 10;
			totalSum += d * d;
		}

		return totalSum;
	}

	public boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<>();

		while (n != 1 && !seen.contains(n)) {
			seen.add(n);
			n = getNext(n);
		}

		return n == 1; // checking because of which loop ended
		// because it will decide
	}
}