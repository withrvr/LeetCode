public class Solution extends GuessGame {
	public int guessNumber(int high) {
		int low = 1;

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (guess(mid) == 1)
				low = mid + 1;
			else
				high = mid;
		}

		return low;
	}
}
