// binary search
// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {
	public int guessNumber(int high) {
		int low = 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int res = guess(mid);

			if (res == 0)
				return mid;
			else if (res < 0) // -1
				high = mid - 1;
			else // > 0 // 1
				low = mid + 1;
		}

		return -1;
	}
}
