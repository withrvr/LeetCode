// little change/better
// in a.java

// checking using length
// for each

class Solution {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0, j;

		for (int val : arr1) {
			for (j = 0; j < arr2.length; j++)
				if (Math.abs(val - arr2[j]) <= d)
					break;

			if (j == arr2.length)
				count++;
		}

		return count;
	}
}
