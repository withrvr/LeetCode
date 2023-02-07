// 2 ms
// my logic

// EXAMPLE: [1, 4, 2, 5, 3]

// 0:1
// --> 1,
// 0:3
// --> 1, 4, 2,
// 0:5
// --> 1, 4, 2, 5, 3,

// 1:2
// --> 4,
// 1:4
// --> 4, 2, 5,

// 2:3
// --> 2,
// 2:5
// --> 2, 5, 3,

// 3:4
// --> 5,

// 4:5
// --> 3,

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		for (int left = 0; left < arr.length; left++) {

			for (int right = left + 1; right <= arr.length; right += 2) { // IMP: +2 here
				System.out.println(left + ":" + right);
				System.out.print("--> ");

				for (int i = left; i < right; i++) {
					System.out.print(arr[i] + ", ");
					sum += arr[i];
				}

				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		return sum;
	}
}
