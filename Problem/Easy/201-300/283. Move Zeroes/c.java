// for starting non zero numbers in array
// it swap it with it self
// so
// if all non zero number
// it will swap with it self

class Solution {
	public void moveZeroes(int[] nums) {
		int point = 0; // non Zero Counter or pointer

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int t = nums[point];
				nums[point++] = nums[i];
				nums[i] = t;
			}
		}
	}
}
