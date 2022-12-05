// https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/854842963/

#include <vector>
#include <algorithm>
using namespace std;

class Solution
{
public:
	int findKthLargest(vector<int> &nums, int k)
	{
		sort(nums.begin(), nums.end(), greater<int>());
		return nums[k - 1];
	}
};