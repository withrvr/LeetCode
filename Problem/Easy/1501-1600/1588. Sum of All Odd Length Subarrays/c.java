// 💀💀💀💀💀

// refer:  ./image.png

// [6,9,14,5,3,8,7,12,13,1]
// don't work for this also

// unique case: for some reason
// if n = 3
// then instead of 232
// they follows as 222

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int n = arr.length, sum = 0, i = -1;
		int low = (int) Math.ceil(n / 2.0);
		// int high = n - 1;

		System.out.println("n: " + n);
		System.out.println();

		for (int val = low; val < n; val++) {
			sum += (arr[++i] * val);
			System.out.println(String.format("%d: %d * %d", i, arr[i], val));
		}

		if (n % 2 == 1) {

			// can use this also
			// sum += (arr[++i] * (n == 3 ? 2 : n));
			// can use direct 2 or n-1

			sum += (arr[++i] * n);
			if (n == 3) {
				sum -= arr[i];
				System.out.println(String.format("%d: %d * %d <-- mid <-- special case 3", i, arr[i], 3));
			} else {
				System.out.println(String.format("%d: %d * %d <-- mid", i, arr[i], n));
			}
		} else {
			System.out.println("mid");

		}

		for (int val = n - 1; val >= low; val--) {
			sum += (arr[++i] * val);
			System.out.println(String.format("%d: %d * %d", i, arr[i], val));
		}

		return sum;
	}
}