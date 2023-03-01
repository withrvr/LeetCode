// d.java short version

class Solution {
	public int maxProfit(int prices[]) {
		int current_min = 0;
		int max_diff = 0;

		for (int i = 1; i < prices.length; i++)
			if (prices[i] < prices[current_min])
				current_min = i;
			else
				max_diff = Math.max(max_diff, prices[i] - prices[current_min]);

		return max_diff;
	}
}
