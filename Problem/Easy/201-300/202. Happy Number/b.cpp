// https://leetcode.com/problems/happy-number/submissions/853846641/

class Solution
{
public:
	int findSum(int num) // add individula numbers to find out the sum
	{
		int dig, sqr, sum = 0;
		while (num) // num > 0, num!=0 // more improved
		{
			dig = num % 10;
			num /= 10;
			sqr = (dig * dig);
			sum += sqr;

			// cout << dig << " * " << dig << " = " << sqr << "\n";
		}
		// cout << "sum: " << sum << "\n\n";
		return sum;
	};

	bool isHappy(int n)
	{
		int count = 0;
		set<int> seen;

		do // till we get the sum of numbers as 1
		{
			n = findSum(n);

			if (n == 1)
				return true;
			else if (seen.find(n) != seen.end())
			{
				// cout << n << " : is repeating in forming a loop" << endl;
				return false;
			}

			seen.insert(n);

			// for (int i : seen)
			// 	cout << i << " ";
			// cout << endl;

		} while (true);

		return false;
	}
};