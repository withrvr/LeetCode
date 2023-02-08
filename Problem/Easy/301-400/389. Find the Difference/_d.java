// 1 ms
// https://leetcode.com/problems/find-the-difference/solutions/1751380/java-c-python-very-very-easy-to-go-solution/

// '^'

// for number
// 5 ^ 5    =>   0
// 5 ^ -5   =>  -2
// 5 ^ 10   =>   15
// 5 ^ -10  =>  -13
// -5 ^ -10 =>   13

// for char
// 'c' ^ 'c'   =>   0
// 'c' ^ -'c'  =>  -2
// 'c' ^ 'f'   =>   5
// 'c' ^ -'f'  =>  -7
// -'c' ^ -'f' =>   7

// for char its like
// from 0 / center
// you are going front
// or going back
// or staying there

// ie

// 0 ^ 'a'  =>  97
// 0 ^ -'a' => -97

// class Solution {
// 	public char findTheDifference(String s, String t) {
// 		char c = 0;

// 		for (char cs : s.toCharArray())
// 			c ^= cs;

// 		for (char ct : t.toCharArray())
// 			c ^= ct;

// 		return c;
// 	}
// }

class Solution {
	public char findTheDifference(String s, String t) {
		char c = 0;

		int i;

		for (i = 0; i < s.length(); i++) {
			c ^= s.charAt(i);
			c ^= t.charAt(i);
		}

		c ^= t.charAt(i);

		return c;
	}
}
