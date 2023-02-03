class Solution {
	public int hammingWeight(int n) {
		int count = 0;

		// 32 given in que
		for (int i = 0; i < 32; i++) {
			count += (n & 1);
			// System.out.println(n);
			n >>= 1;
		}

		return count;
	}
}