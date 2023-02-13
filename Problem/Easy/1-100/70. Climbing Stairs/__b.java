// _b.java
// better version

class Solution {
	private int arr[] = new int[46];

	Solution() {
		arr[1] = 1;
		arr[2] = 2;
	}

	public int climbStairs(int n) {
		// if not calculated before
		if (arr[n] == 0)
			arr[n] = climbStairs(n - 1) + climbStairs(n - 2);

		return arr[n];
	}
}
