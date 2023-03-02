// Execution : 6 ms

class Solution {
	public int characterReplacement(String s, int k) {
		int arr[] = new int[26];
		int n = s.length();

		int max_freq = 0, res = 0, window_len;

		for (int left = 0, right = 0; right < n; right++) {
			max_freq = Math.max(max_freq, ++arr[s.charAt(right) - 'A']);
			window_len = right - left + 1;

			if (window_len - max_freq <= k) {
				res = Math.max(res, window_len);
			} else {
				arr[s.charAt(left) - 'A']--;
				left++;
			}
		}

		return res;
	}
}
