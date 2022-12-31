// double iteration
// current pos val present after it in array
// found duplicate

// Time: TLE (Time Limit Exceeded)
// just for logic / understanding
// not recommend to use

// Time complexity: O(n*2)
// Space complexity: O(1)

class Solution {
	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
