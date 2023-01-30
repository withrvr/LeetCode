// logic
// https://leetcode.com/problems/climbing-stairs/discussion/comments/1570512/

// since n is max 45
// recursion with memorization
// addition of last two

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n) ... because only for left side ... ie n-1 calculation are done ... then other are just got from array
// Space complexity: O(46)

class Solution {
	private int arr[] = new int[46];

	Solution() {
		// if (n < 3)
		// return n;

		// 0 stairs is not possible ... also default value is 0
		// arr[0] = 0;

		arr[1] = 1;
		arr[2] = 2;
	}

	public int climbStairs(int n) {
		// if its calculated before
		if (arr[n] != 0)
			return arr[n];

		// else calculate and store
		int val = climbStairs(n - 1) + climbStairs(n - 2);
		arr[n] = val;
		return val;
	}
}