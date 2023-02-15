// __c.java
// more better / advance version

// making it like d.java .... but my logic way

class Solution {
	public void merge(int[] nums_1, int m, int[] nums_2, int n) {
		for (int i = nums_1.length - 1; n != 0; i--) {
			if (m == 0)
				nums_1[i] = nums_2[--n];
			else
				nums_1[i] = nums_1[m - 1] > nums_2[n - 1] ? nums_1[--m] : nums_2[--n];
		}
	}
}

// now if you do more .... better version it will become like d.java
