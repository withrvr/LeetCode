
class Solution {
	public int hammingWeight(int n) {
		int count = 0;

		do
			count += (n & 1);
		while ((n >>>= 1) != 0);

		return count;
	}
}
