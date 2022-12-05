// https://leetcode.com/problems/two-sum/submissions/853965850/

class Solution
{
public:
	vector<int> twoSum(vector<int> &nums, int target)
	{
		unordered_map<int, int> ele;

		for (int i = 0; i < nums.size(); i++)
		{
			int num = nums[i];
			int num2 = target - num;

			if (ele.find(num2) != ele.end())
				return {ele[num2], i};

			ele[num] = i;
		}

		return {NULL, NULL}; // in case no solution
	}
};