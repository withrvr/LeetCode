// 💀: Trying

// count
// then check before and after

// To Code : ? min
// Execution : ? ms

// Time complexity: O(?)
// Space complexity: O(?)

// import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("\nAns:- " + s.characterReplacement("AABABBAABABABB", 2) + "\n");
	}
}

class Solution {
	class Track {
		Character ch;
		Integer count;

		Track(Character ch, Integer count) {
			this.ch = ch;
			this.count = count;
		}
	}

	public int characterReplacement(String s, int k) {
		List<Track> list = new ArrayList<>();
		int n = s.length();

		// counting
		char last = s.charAt(0);
		int count = 1;

		for (int i = 1; i < n; i++) {
			char ch = s.charAt(i);

			if (ch != last) {
				list.add(new Track(last, count));

				count = 0;
				last = ch;
			}

			count++;
		}
		list.add(new Track(last, count));

		// print
		for (Track track : list) {
			System.out.format("ch = %c, count=%d\n", track.ch, track.count);
		}

		return -1;
	}
}
