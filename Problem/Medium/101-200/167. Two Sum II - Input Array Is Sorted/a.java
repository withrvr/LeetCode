// two pointer

// To Code : 30 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(1)

// ex: `[1,2,3,4,6,7,8]` target=6

// # index start from 1 ... for output
// # all unique no
// # only one possible solution

class Solution {
	public int[] twoSum(int[] arr, int target) {
		int left = 0, right = arr.length - 1, sum;

		// given: since always there will be the answer
		// then no need to do: left < right
		while (true) {
			// do sum before only
			// else need to do more than 1 times
			sum = arr[left] + arr[right];

			if (sum == target)
				break;
			// return new int[] { left + 1, right + 1 };
			// not returning here because ..... something should be return ......
			// so breaking then returning

			else if (sum < target)
				left++;
			// no need to check extra condition
			// else if (sum > target)
			else
				right--;
		}

		// NOTE: + 1 .... is imp
		return new int[] { left + 1, right + 1 };
	}
}

// NOTE:- you can try to change / tweak in
// to while(left<right)
// and direct return in if statement
// then return null; ... at end
