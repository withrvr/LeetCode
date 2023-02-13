class Solution {
	public int tribonacci(int n) {
		if (n < 2)
			return n;

		int a = 0, b = 1, c = 1, temp;

		while (n-- > 2) {
			temp = a + b + c;
			a = b;
			b = c;
			c = temp;
		}

		return c;
	}
}
