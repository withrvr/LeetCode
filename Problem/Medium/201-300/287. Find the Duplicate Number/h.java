// g.java ... small/fast version

// slow, fast method
// tortoise, hare method

// To Code : not understand at first ... to took time
// Execution : 4 ms

// Time complexity: O(n) .... O(n+n)
// Space complexity: O(1)

class Solution {
	public int findDuplicate(int[] nums) {
		int slow = 0, fast = 0;

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		slow = 0;
		while (fast != slow) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return fast;
	}
}