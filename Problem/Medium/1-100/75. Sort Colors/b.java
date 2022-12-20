// swaping
// while tracking the last positions of the 0, 2
// and changing it ... 1 will automatically sort
// and traversing using mid ... and sorting

// https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
// first solution ... explanation

class Solution {
	public void sortColors(int[] a) {
		int l = 0, m = 0, r = a.length - 1, t; // left, mid, right, temp

		// // using for loop // more efficient
		// for (; m <= r; m++) {

		// if (a[m] == 0) {
		// t = a[m];
		// a[m] = a[l];
		// a[l] = t;

		// l++;
		// } else if (a[m] == 2) {
		// t = a[m];
		// a[m] = a[r];
		// a[r] = t;

		// m--; // because m will ++ .. and we need to stay on that position only
		// r--;
		// }
		// // if 1 .. m is increasing only
		// }

		// using while loop // better
		while (m <= r) {
			switch (a[m]) {
				case 0:
					t = a[l];
					a[l] = a[m];
					a[m] = t;

					l++;
					m++;
					break;

				case 1:
					m++;
					break;

				case 2:
					t = a[r];
					a[r] = a[m];
					a[m] = t;

					r--;
					break;
			} // switch end
		} // while loop end
	}
}