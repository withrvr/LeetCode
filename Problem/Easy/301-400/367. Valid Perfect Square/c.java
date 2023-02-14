// binary search

class Solution {
	public boolean isPerfectSquare(int num) {
		long start = 1;
		long end = num;

		while (start <= end) {
			long mid = start + (end - start) / 2;
			long mul = mid * mid;

			if (mul == num)
				return true;
			else if (mul > num)
				end = mid - 1;
			else
				start = mid + 1;
		}

		return false;
	}
}
