// Execution : 4 ms

// can use any loop ... make no changes

// use this
// char[] chars = s.toCharArray();
// then ++chars[right]
// then chars[left]++

// s.charAt(...) ... take more time

class Solution {
	public int characterReplacement(String s, int k) {
		int arr[] = new int[26];
		int n = s.length();

		int max_freq = 0, res = 0, window_len;

		int left = 0, right = 0;
		while (right < n) {
			max_freq = Math.max(max_freq, ++arr[s.charAt(right) - 'A']);
			window_len = right - left + 1;

			if (window_len - max_freq <= k) {
				res = Math.max(res, window_len);
			} else {
				arr[s.charAt(left) - 'A']--;
				left++;
			}
			right++;
		}

		return res;
	}
}
