// 0 ms

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<List<Integer>> generate(int numRows) {

		final List<List<Integer>> result = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {

			int num = 1;
			List<Integer> row = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				row.add(num);
				num = num * (i - j) / j;
			}
			result.add(row);
		}
		return result;
	}
}