// https://leetcode.com/problems/happy-number/solutions/421162/happy-number/
// Approach 3: Hardcoding the Only Cycle (Advanced)
// last solution

// 1 ms

class Solution {
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
		while (n != 1 && n != 4)
			n = getNext(n);
		return n == 1;
	}
}
