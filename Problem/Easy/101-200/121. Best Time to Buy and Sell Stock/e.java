// if seen properly same as
// d.java ... but different perspective

// left, right

// left as min value
// right as traversing

// To Code : 15 min
// Execution : 2 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int maxProfit(int prices[]) {
		// if(prices.length < 2)
		// return 0;

		int left = 0, right = 1, max_diff = 0;

		while (right < prices.length) {
			if (prices[left] < prices[right])
				max_diff = Math.max(max_diff, prices[right] - prices[left]);
			else
				left = right;

			right++;
		}

		return max_diff;
	}
}
