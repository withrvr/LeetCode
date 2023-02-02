// using while loop
// in starting to find

class Solution {
	public void moveZeroes(int[] nums) {

		// first occurrence of 0
		int i = 0;
		while (i < nums.length && nums[i++] != 0) {
		}
		int point = i - 1;

		for (; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[point++] = nums[i];
				nums[i] = 0;
			}
		}
	}
}
