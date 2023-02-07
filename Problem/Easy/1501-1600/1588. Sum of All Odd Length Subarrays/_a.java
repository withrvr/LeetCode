class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		for (int left = 0; left < arr.length; left++)
			for (int right = left; right < arr.length; right++)
				if ((right - left + 1) % 2 == 1)
					for (int i = left; i < right + 1; i++)
						sum += arr[i];

		return sum;
	}
}
