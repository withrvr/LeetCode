// see which number is it
// then add one more to where it belongs // like insertion sort
// and at one one element to other numbers also .. who are after it

class Solution {
	public void sortColors(int[] a) {
		int n0 = -1, n1 = -1, n2 = -1;

		for (int i = 0; i < a.length; ++i) {
			if (a[i] == 0) {
				a[++n2] = 2;
				a[++n1] = 1;
				a[++n0] = 0;
			} else if (a[i] == 1) {
				a[++n2] = 2;
				a[++n1] = 1;
			} else { // if (a[i] == 2)
				++n2; // a[++n2] = 2;
			}
		}
	}
}