// pro logic
// https://www.youtube.com/watch?v=5Km3utixwZs&ab_channel=NeetCode

class Solution {
	public int hammingWeight(int n) {
		int count = 0;

		while (n != 0) {
			System.out.print("Before: " + n);

			n &= (n - 1); // n = n & (n - 1);

			System.out.println(", After : " + n);

			count++;
		}

		return count;
	}
}
