// a.java
// short version

// same logic and using other array
// because input array should not change

// tc: O(n)
// sc: O(n)

class Solution {
	public int minCostClimbingStairs(int[] cost) {
		int res[] = new int[cost.length];

		res[0] = cost[0];
		res[1] = cost[1];

		for (int i = 2; i < res.length; i++)
			res[i] = cost[i] + Math.min(res[i - 1], res[i - 2]);

		return Math.min(res[res.length - 1], res[res.length - 2]);
	}
}
