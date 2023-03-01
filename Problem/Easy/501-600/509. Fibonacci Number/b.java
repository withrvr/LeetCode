class Solution {
	public int fib(int n) {
		int a = 0, b = 1, temp;

		for (int i = 0; i < n; i++) {
			// a, b = b, a+b

			temp = a;
			a = b;
			b = temp + b;
		}

		return a;
	}
}