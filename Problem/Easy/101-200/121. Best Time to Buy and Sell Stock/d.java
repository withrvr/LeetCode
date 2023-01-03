// one pass

// same as c.java ... but
// storing current min value
// index instead of value
// increase the speed

// To Code : 15 min
// Execution : 2 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int maxProfit(int prices[]) {
		// if(prices.length < 2)
		// return 0;

		int current_min = 0; // current minimum value index
		int max_diff = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < prices[current_min])
				current_min = i;
			else
				max_diff = Math.max(max_diff, prices[i] - prices[current_min]);
		}

		return max_diff;
	}
}
