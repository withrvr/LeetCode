// Approach 4.2: Array as HashMap (Iterative)
// https://leetcode.com/problems/find-the-duplicate-number/solutions/127594/find-the-duplicate-number/

// ⚠️: NOTE
// You must solve the problem without modifying the array nums // 💀: we used
// and uses only constant extra space.

// To Code : 5 min
// Execution : 7 ms

// Time complexity: O(n) // 💀
// Space complexity: O(1)

class Solution {
	public int findDuplicate(int[] nums) {
		while (nums[0] != nums[nums[0]]) {
			int nxt = nums[nums[0]];
			nums[nums[0]] = nums[0];
			nums[0] = nxt;
		}
		return nums[0];
	}
}
