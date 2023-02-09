// can manipulate in cpp
// string using pointer

class Solution
{
public:
	string toLowerCase(string str)
	{
		for (char &c : str)
			if (c >= 'A' && c <= 'Z')
				c += 32;

		return str;
	}
};
