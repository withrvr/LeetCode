// 💀💀💀💀💀

// short-version / no-explanation

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int n = arr.length, sum = 0, i = -1;
		int low = (int) Math.ceil(n / 2.0);

		for (int val = low; val < n; val++)
			sum += (arr[++i] * val);

		if (n % 2 == 1)
			sum += (arr[++i] * (n == 3 ? 2 : n));

		for (int val = n - 1; val >= low; val--)
			sum += (arr[++i] * val);

		return sum;
	}
}
