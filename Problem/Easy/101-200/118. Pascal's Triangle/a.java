// To Code : 30 min
// Execution : 1 ms

// Time complexity: O(n*log(n))
// Space complexity: O(1)

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();

		result.add(Arrays.asList(1));
		if (numRows == 1)
			return result;

		result.add(Arrays.asList(1, 1));
		if (numRows == 2)
			return result;

		for (int i = 2; i < numRows; i++) {
			List<Integer> temp = new ArrayList<>();
			temp.add(1);

			for (int j = 1; j < i; j++) {
				temp.add(
						result.get(i - 1).get(j - 1) +
								result.get(i - 1).get(j));
			}

			temp.add(1);
			result.add(temp);
		}

		return result;
	}
}
