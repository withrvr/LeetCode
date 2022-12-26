// sets

// add method
// current pos val present before also
// found duplicate

// best
// time: 4ms
// Time complexity: O(n)
// Space complexity: O(n)

import java.util.HashSet;

class Solution {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int val : nums) {
			if (!set.add(val)) {
				return true;
			}
		}

		return false;
	}
}
