// build in math func
// a.java ... more better

// To Code : 3 min
// Execution : ? ms

// Time complexity: O(1)
// Space complexity: O(1)

class Solution {
	public boolean isPerfectSquare(int num) {
		int val = (int) Math.pow(num, 0.5);
		return num == val * val;
	}
}
