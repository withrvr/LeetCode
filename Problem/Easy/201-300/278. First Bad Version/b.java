// Binary Search

// To Code : 5 min
// Execution : 30+ ms

// Time complexity: O(log(n))
// Space complexity: O(1)

// The isBadVersion API is defined in the parent class VersionControl.
// boolean isBadVersion(int version);

// class VersionControl {
// 	boolean isBadVersion(int version) {
// 		return false; // or true
// 	};
// }

class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		if (isBadVersion(1))
			return 1;

		int left = 2, right = n, mid;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (isBadVersion(mid) && isBadVersion(mid - 1) == false)
				return mid;
			else if (isBadVersion(mid))
				right = mid - 1;
			else
				left = mid + 1;
		}

		return n;
	}
}
