// b.java
// short version

class Solution {
	public void merge(int[] nums_1, int m, int[] nums_2, int n) {
		int res[] = new int[nums_1.length];

		int point_1 = 0;
		int point_2 = 0;

		for (int i = 0; i < res.length; i++)
			res[i] = point_1 == m ? nums_2[point_2++]
					: point_2 == n ? nums_1[point_1++]
							: nums_1[point_1] < nums_2[point_2] ? nums_1[point_1++] : nums_2[point_2++];

		for (int i = 0; i < nums_1.length; i++)
			nums_1[i] = res[i];
	}
}
