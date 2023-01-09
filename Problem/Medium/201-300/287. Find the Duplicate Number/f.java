// something like d.java
// but using visited arr instead of making elements -ve

// Approach 3: Negative Marking
// https://leetcode.com/problems/find-the-duplicate-number/solutions/127594/find-the-duplicate-number/

// ⚠️: NOTE
// You must solve the problem without modifying the array nums
// and uses only constant extra space. // 💀: we used

// To Code : 5 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(n) // 💀

class Solution {
	public int findDuplicate(int[] nums) {
		// its fast and using less memory
		// because of ***boolean array

		boolean visited[] = new boolean[nums.length];
		int i = 0;
		while (!visited[nums[i]]) {
			visited[nums[i]] = true;
			i++;
		}
		return nums[i];
	}
}
