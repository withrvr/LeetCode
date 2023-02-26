import java.util.Scanner;

class CodeChef {

	public static void solve(int a, int b) {
	}

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		while (t-- != 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			solve(a, b);
		}

		scan.close();
	}

	public static void yes() {
		System.out.println("YES");
	}

	public static void no() {
		System.out.println("NO");
	}
}
