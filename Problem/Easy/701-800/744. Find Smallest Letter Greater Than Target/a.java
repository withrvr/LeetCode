// logic, explanation

// To Code : ? min
// Execution : ? ms

// Time complexity: O(n*log(n))
// Space complexity: O(n)

class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
		for (char val : letters)
			if (val > target)
				return val;

		return letters[0];
	}
}
