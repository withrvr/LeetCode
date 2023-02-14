
class Solution {
	public int minCostClimbingStairs(int[] cost) {
		int first = cost[0], second = cost[1], curr_val;

		for (int i = 2; i < cost.length; i++) {
			curr_val = cost[i] + Math.min(first, second);

			first = second;
			second = curr_val;
		}

		return Math.min(first, second);
	}
}
