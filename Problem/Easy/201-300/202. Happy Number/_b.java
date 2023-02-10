// 1 ms

// seen.add(n) .... to check if it contain
// no need of !seen.contains(n)

// be cause .add return false .... if element is there before only

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

		while (n != 1 && seen.add(n))
			n = getNext(n);

		return n == 1;
	}
}
