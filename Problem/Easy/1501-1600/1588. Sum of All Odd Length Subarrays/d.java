// 0 ms
// i didn't solved
// understand half only

// - https://leetcode.com/problems/sum-of-all-odd-length-subarrays/solutions/2773805/sum-of-all-odd-length-subarrays/
// ![fastest logic Image](./image.png)

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int n = arr.length, answer = 0;

		for (int i = 0; i < n; ++i) {
			int left = i, right = n - i - 1;
			answer += arr[i] * (left / 2 + 1) * (right / 2 + 1);
			answer += arr[i] * ((left + 1) / 2) * ((right + 1) / 2);
		}

		return answer;
	}
}
