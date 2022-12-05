// https://leetcode.com/problems/happy-number/submissions/853768507/

class Solution
{
public:
	int findSum(int num) // find sum of square of digits
	{
		int dig, sum = 0, mul;
		while (num != 0) // add individual numbers to find out the sum
		{
			dig = num % 10;
			num /= 10;
			mul = (dig * dig);
			sum += mul;

			// cout << dig << " * " << dig << " = " << mul << "\n";
		}
		// cout << "sum: " << sum << "\n\n";
		return sum;
	};

	bool isHappy(int n)
	{
		int count = 0;
		vector<int> track;

		do // till we get the sum of numbers as 1
		{
			n = findSum(n);

			if (n == 1)
				return true;
			else if (find(track.begin(), track.end(), n) != track.end())
			{
				// cout << n << " : is repeating in forming a loop" << endl;
				return false;
			}

			track.push_back(n);

			// for (int i : track)
			// 	cout << i << " ";
			// cout << endl;

		} while (true);

		return false;
	}
};