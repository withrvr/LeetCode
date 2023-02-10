// https://leetcode.com/problems/happy-number/solutions/421162/happy-number/
// Approach 3: Hardcoding the Only Cycle (Advanced)

// 1ms

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	private static Set<Integer> cycleMembers = new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

	public int getNext(int n) {
		int totalSum = 0;
		while (n > 0) {
			int d = n % 10;
			n = n / 10;
			totalSum += d * d;
		}
		return totalSum;
	}

	public boolean isHappy(int n) {
		while (n != 1 && !cycleMembers.contains(n))
			n = getNext(n);

		return n == 1;
	}
}
