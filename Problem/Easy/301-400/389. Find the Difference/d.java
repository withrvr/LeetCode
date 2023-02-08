// _d.java ... logic

// 1 ms

// (int) to convert
// without it also work

// also see __d.java ... can use char directly

// O(n)
// O(1)

class Solution {
	public char findTheDifference(String s, String t) {
		int s_count = 0, t_count = 0;

		int i;
		for (i = 0; i < s.length(); i++) {
			t_count += (int) t.charAt(i);
			s_count += (int) s.charAt(i);
		}
		t_count += (int) t.charAt(i);

		return (char) (t_count - s_count);
	}
}