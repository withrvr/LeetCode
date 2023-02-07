// 2 ms

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		for (int left = 0; left < arr.length; left++)
			for (int right = left + 1; right <= arr.length; right += 2)
				for (int i = left; i < right; i++)
					sum += arr[i];

		return sum;
	}
}
