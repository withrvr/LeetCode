// To Code : 5 min
// Execution : TLE ms

// Time complexity: O(n*log(n))
// Space complexity: O(1)

class Solution {
	public int[] dailyTemperatures(int[] temperatures) {

		for (int i = 0; i < temperatures.length; i++) {
			boolean found = false;
			for (int j = i + 1; j < temperatures.length; j++) {
				if (temperatures[j] > temperatures[i]) {
					temperatures[i] = j - i;
					found = true;
					break;
				}
			}

			if (!found)
				temperatures[i] = 0;
		}

		return temperatures;
	}
}
