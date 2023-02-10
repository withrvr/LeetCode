// slow, fast
// 1 ms ?

// if first element is 1 only
// it will breach in first condition only

// tc: O(n)
// sc: O(1)

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
		int slowRunner = n;
		int fastRunner = getNext(n);

		while (fastRunner != 1 && slowRunner != fastRunner) {
			slowRunner = getNext(slowRunner);
			fastRunner = getNext(getNext(fastRunner)); // this take little more time ... because of calculation
			// can use memorization to remember it
		}

		return fastRunner == 1;
	}
}
