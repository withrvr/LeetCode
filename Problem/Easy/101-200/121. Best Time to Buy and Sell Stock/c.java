// one pass

// To Code : 15 min
// Execution : 3 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int maxProfit(int prices[]) {
		// if(prices.length < 2)
		// return 0;

		int current_min = prices[0]; // current min value
		int max_diff = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < current_min)
				current_min = prices[i];
			else
				max_diff = Math.max(max_diff, prices[i] - current_min);
		}

		return max_diff;
	}
}