// 1 ms

// same as
// __a.java

import java.util.Arrays;

class Solution {
	public void merge(int[] num1, int m, int[] num2, int n) {
		for (int i = 0; i < n; i++)
			num1[i + m] = num2[i];

		Arrays.sort(num1);
	}
}
