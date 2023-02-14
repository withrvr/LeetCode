// https://leetcode.com/problems/min-cost-climbing-stairs/solutions/144682/3-lines-java-solution-o-1-space/

// A bit DP and a bit Greedy

// To Code : 30 min
// Execution : ? ms

// Time complexity: O(n)
// Space complexity: O(1)

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		// arr = new int[] { 33 };
		arr = new int[] { 1, 2, 3, 3, 4, 4, 4, 5 };

		System.out.println("\n Ans:- " + s.minCostClimbingStairs(arr) + "\n");

		System.out.println();
		// System.out.println("\n new new:- " + Arrays.toString(arr) + "\n");
	}
}

class Solution {
	public int minCostClimbingStairs(int[] cost) {

		// 2 <= cost.length <= 1000
		// given

		// so no need

		// if (cost.length <= 2)
		// return Math.min(cost[0], cost[1]);

		System.out.println("Arrays:- " + Arrays.toString(cost) + "\n");

		System.out.println(Arrays.toString(cost));

		for (int i = 2; i < cost.length; i++) {
			cost[i] += Math.min(cost[i - 1], cost[i - 2]);
			System.out.println(Arrays.toString(cost));
		}

		return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
	}
}
