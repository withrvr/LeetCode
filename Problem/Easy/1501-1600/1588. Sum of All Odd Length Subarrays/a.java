// easy
// brute force
// copy from Leet Code

// To Code : 15 min
// Execution : 3 ms

// Time complexity: O(n^3)
// Space complexity: O(1)

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int n = arr.length, answer = 0;

		for (int left = 0; left < n; ++left) {
			for (int right = left; right < n; ++right) {
				if ((right - left + 1) % 2 == 1) {
					int currentSum = 0;
					for (int index = left; index < right + 1; ++index) {
						currentSum += arr[index];
					}
					answer += currentSum;
				}
			}
		}
		return answer;
	}
}
