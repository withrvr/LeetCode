// To Code : 2 min
// Execution : 7 ms

// Time complexity: O(n)
// Space complexity: O(26)

// doing this again is IMP: right - left + 1
// NOTE : this is diff : s.charAt(left) and s.charAt(right )

// # res : max window length

class Solution {
	public int characterReplacement(String s, int k) {
		int arr[] = new int[26];
		int n = s.length();

		int max_freq = 0, res = 0;

		for (int left = 0, right = 0; right < n; right++) {
			max_freq = Math.max(max_freq, ++arr[s.charAt(right) - 'A']);

			// System.out.format("left=%d : right=%d --> range=%d --> max=%d\n",
			// left, right, right - left + 1, max_freq, right - left + 1 - max_freq);

			if (right - left + 1 - max_freq > k) {
				arr[s.charAt(left) - 'A']--;
				left++;

				// System.out.format("-----> left=%d : right=%d --> range=%d --> max=%d\n\n",
				// left, right, right - left + 1, max_freq, right - left + 1 - max_freq);
			}

			res = Math.max(res, right - left + 1);
		}

		return res;
	}
}
