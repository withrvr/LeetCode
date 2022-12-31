// sets

// set(arr).size
// not same arr.size ... duplicate

// Time: 15ms
// Time complexity: O(n)
// Space complexity: O(n)

import java.util.HashSet;

class Solution {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int val : nums)
			set.add(val); // all value in sets
		return nums.length != set.size(); // if not same .. means duplicate is there
	}
}
