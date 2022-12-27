// swapping first element with last
// then 2 ... to last

// this method will make last ele to come 1st, 1st to last
// then 2nd iteration that 1st will become 2nd ... and 2nd will become last .... logically
// and so on

// not recommended
// b.java better ... but it is also TLE

// Time: TLE (Time Limit Exceeded) ... for last testcase
// Time complexity: O(n*r)
// Space complexity: O(1)

class Solution {
	public void rotate(int[] arr, int k) {
		int rotate = k % arr.length; // no need of extra rotation
		int n = arr.length;

		// outer loop how many time to rotate
		for (int r = 0; r < rotate; r++) {
			// inner loop rotate arr one time
			int temp, j = n - 1;

			for (int i = 0; i < j; i++) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
