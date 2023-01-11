// compress version of d.java
// two pointer

// without using isDel variable

// To Code : 30 min
// Execution : 8 ms ... how i dont know

// Time complexity: O(2 * n)
// Space complexity: O(1)

class Solution {
	public boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if ((s.charAt(left) != s.charAt(right))) {
				return helper(s, left + 1, right) || helper(s, left, right - 1);
			}
			left++;
			right--;
		}
		return true;
	}

	public boolean helper(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
