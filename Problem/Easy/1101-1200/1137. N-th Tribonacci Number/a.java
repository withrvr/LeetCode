// recursion ... memorization

// To Code : 15 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(38)

class Solution {
	private int arr[] = new int[38];

	Solution() {
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
	}

	public int tribonacci(int n) {
		if (n == 0 || n == 1 || n == 2)
			return arr[n]; // return n ... don't work here ... because for n==2 it should be 1

		// if not calculated before calculate then
		if (arr[n] == 0)
			arr[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);

		return arr[n];
	}
}
