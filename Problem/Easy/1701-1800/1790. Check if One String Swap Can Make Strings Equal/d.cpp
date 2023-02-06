class Solution
{
public:
	bool areAlmostEqual(string s1, string s2)
	{
		int diff = 0;
		char a, b;

		for (int i = 0; i < s1.length(); i++)
		{
			if (s1[i] != s2[i])
			{
				if (diff == 2 || (diff == 1 && (s1[i] != b || s2[i] != a)))
					return false;
				else
					a = s1[i], b = s2[i];
				diff++;
			}
		}
		if (diff == 1)
			return false;
		return true;
	}
};