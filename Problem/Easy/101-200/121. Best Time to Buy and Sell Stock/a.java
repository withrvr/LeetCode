// first attempt
// works for ... [2,4,1]
// don't for ... [7,2,4,1]

class Solution {
	public int maxProfit(int[] arr) {
		int sm = 0; // shortest value index
		int lg = 0; // shortest value index

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[sm])
				sm = i;
			if (arr[i] > arr[lg])
				lg = i;
		}

		int n_lg = sm; // next, largest after sm
		int n_sm = lg; // next, small value before lg

		for (int i = sm + 1; i < arr.length; i++) {
			if (arr[i] > arr[n_lg])
				n_lg = i;
		}

		for (int i = lg - 1; i >= 0; i--) {
			if (arr[i] < arr[n_sm])
				n_sm = i;
		}

		// System.out.println(l + " : " + s);

		return Math.max(arr[n_lg] - arr[sm], arr[lg] - arr[n_sm]);
	}
}
