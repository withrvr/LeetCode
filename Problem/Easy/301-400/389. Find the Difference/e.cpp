// https://leetcode.com/problems/find-the-difference/solutions/1751509/c-time-100-memory-98-6-3-lines-propagate-the-difference-ascii/

// like _d.java only
// but more advance
// not using extra variable

class Solution
{
public:
	char findTheDifference(string s, string t)
	{
		for (int i = 0; i < s.size(); i++)
			t[i + 1] += t[i] - s[i]; // Passing the diff: (t[i]-s[i]) to t[i+1]

		return t[t.size() - 1]; // The diff will be carried over to the last element eventually
	}
};