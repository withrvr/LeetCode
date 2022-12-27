// swap last element with first ... using temp
// swap all other elements from end ... which its -1 position
// do this how many time asked

// no recommended ...

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
			int temp = arr[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
		}
	}
}
