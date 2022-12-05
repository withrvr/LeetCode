// https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/854838380/

import java.util.*;

class Solution {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		return nums[nums.length - k];
	}
}