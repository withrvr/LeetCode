// To Code : ? min
// Execution : ? ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public double average(int[] salary) {
		int min = salary[0], max = salary[0];
		double sum = 0.0;

		for (int val : salary) {
			if (val < min)
				min = val;

			if (val > max)
				max = val;

			sum += val;
		}

		return (sum - min - max) / (salary.length - 2);
	}
}
