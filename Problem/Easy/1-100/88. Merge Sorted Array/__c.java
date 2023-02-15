// c.java
// advance version

// ie. this is what .... d.java version ... is with more nicely

class Solution {
	public void merge(int[] nums_1, int m, int[] nums_2, int n) {
		for (int i = nums_1.length - 1; i >= 0; i--) {
			if (m == 0)
				nums_1[i] = nums_2[--n];
			else if (n == 0)
				// nums_1[i] = nums_1[--m]; ... no need to do this
				break;
			else
				nums_1[i] = nums_1[m - 1] > nums_2[n - 1] ? nums_1[--m] : nums_2[--n];
		}
	}
}
