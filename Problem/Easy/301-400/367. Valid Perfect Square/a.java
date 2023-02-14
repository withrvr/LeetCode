// build in math func

// To Code : 3 min
// Execution : ? ms

// Time complexity: O(1)
// Space complexity: O(1)

class Solution {
	public boolean isPerfectSquare(int num) {
		float val = (float) Math.sqrt(num);
		return (int) val == val;
	}
}
