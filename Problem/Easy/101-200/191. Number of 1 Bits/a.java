// you need to treat n as an unsigned value

// To Code : 20 min
// Execution : 0 ms

// Time complexity: O(len(n))
// Space complexity: O(1)

// >>  Signed right shift
// >>> Unsigned right shift

class Solution {
	public int hammingWeight(int n) {
		int m = n;
		int count = 0, d;

		System.out.println(n);
		System.out.println();

		while (n != 0) {
			d = n & 1;
			count += d;

			System.out.print(d + ": " + n + " , " + m);

			n = n >>> 1; // n >>>= 1;
			m = m >> 1;
		}

		return count;
	}
}
