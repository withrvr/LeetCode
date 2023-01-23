// 16 ms

class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int left = 0, right = n;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (isBadVersion(mid))
				right = mid - 1;
			else
				left = mid + 1;
		}

		return left;
	}
}
