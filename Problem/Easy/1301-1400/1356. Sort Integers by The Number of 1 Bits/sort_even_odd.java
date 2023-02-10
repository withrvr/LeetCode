
import java.util.Arrays;
import java.util.Comparator;

class sort_even_odd {
	public static void main(String[] args) {
		Integer[] input;
		// input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		input = new Integer[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Array : " + Arrays.toString(input));
		System.out.println();

		Arrays.sort(input,
				(a, b) -> a % 2 == 0 ? -1 : 1);

		System.out.println("even/odd without sorting ..... " + Arrays.toString(input));
		System.out.println();

		// Separating them using sort comparator
		Arrays.sort(input, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				// If both are odd or even
				// then sorting in increasing order
				if ((a & 1) == (b & 1)) {
					// return a < b ? -1 : 1;
					return a - b;
					// return b - a; // .... for descending;

				}

				// Sorting on the basis of last bit if
				// if one is odd and the other one is even
				// return ((a & 1) < (b & 1)) ? -1 : 1;
				return (a & 1) - (b & 1);
				// return (b & 1) - (a & 1); // .... for descending;
			}
		});

		// Arrays.sort(input,
		// // both even ... a-b ... to find small in them
		// (a, b) -> (a % 2 == 0 && b % 2 == 0) ? a - b
		// // both odd ... a-b ... to find small in them
		// : (a % 2 == 1 && b % 2 == 1) ? a - b
		// // which is even/odd
		// : a % 2 == 0 ? -1 : 1);

		System.out.println("even/odd with sorting ..... " + Arrays.toString(input));
		System.out.println();

		System.out.println("========= special one =========");
		System.out.println("Desc order .... where even come first");

		Arrays.sort(input, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if ((a & 1) == (b & 1)) {
					return b - a;
				}

				return (b & 1) - (a & 1);
			}
		});

		System.out.println(Arrays.toString(input));
		System.out.println();
	}
}
