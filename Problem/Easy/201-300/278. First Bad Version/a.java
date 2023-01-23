// Linear Search
// Brute force

// To Code : 5 min
// Execution : TLE

// Time complexity: O(n)
// Space complexity: O(1)

// The isBadVersion API is defined in the parent class VersionControl.
// boolean isBadVersion(int version);

class VersionControl {
	boolean isBadVersion(int version) {
		return false; // or true
	};
}

class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		for (int i = 1; i < n; i++) {
			if (isBadVersion(i)) {
				return i;
			}
		}
		return n;
	}
}
