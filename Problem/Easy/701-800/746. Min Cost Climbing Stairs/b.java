// Top Down Memoization - O(n) 1ms

class Solution {

	int[] res;

	public int minCostClimbingStairs(int[] cost) {
		int n = cost.length;
		res = new int[n];

		return Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
	}

	private int minCost(int[] cost, int n) {
		if (n < 0)
			return 0;

		if (n == 0 || n == 1)
			return cost[n];

		// if not calculated ... then
		if (res[n] == 0)
			res[n] = cost[n] + Math.min(minCost(cost, n - 1), minCost(cost, n - 2));

		return res[n];
	}
}
