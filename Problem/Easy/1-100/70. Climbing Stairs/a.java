// logic
// https://leetcode.com/problems/climbing-stairs/discussion/comments/1570512/

// recursion
// addition of last two

// To Code : 5 min
// Execution : TLE ms

// Time complexity: ?? ... may be O(2^n)
// Space complexity: O(1)

class Solution {
	public int climbStairs(int n) {
		// ie: 1, 2
		if (n < 3)
			return n;

		return climbStairs(n - 1) + climbStairs(n - 2);
	}
}
