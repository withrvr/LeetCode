// Execution : 4 ms

// using while and for loop make no changes
// # res : max window length

class Solution {
	public int characterReplacement(String s, int k) {
		char[] chars = s.toCharArray();
		int arr[] = new int[26];
		int n = s.length();

		int max_freq = 0, res = 0, window_len;

		for (int left = 0, right = 0; right < n; right++) {
			max_freq = Math.max(max_freq, ++arr[chars[right] - 'A']);
			window_len = right - left + 1;

			// if (window_len - max_freq > k) {
			// arr[chars[left] - 'A']--;
			// left++;
			// } else {
			// res = Math.max(res, window_len);
			// }

			if (window_len - max_freq <= k) {
				res = Math.max(res, window_len);
			} else {
				arr[chars[left] - 'A']--;
				left++;
			}
		}

		return res;
	}
}
