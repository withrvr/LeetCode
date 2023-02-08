import math


class Solution:
    # def nearestValidPoint(self, x: int, y: int, points: List[List[int]]) -> int:
    def nearestValidPoint(self, x: int, y: int, points) -> int:
        res, smallest = -1, math.inf

        for i, (r, c) in enumerate(points):
            if (x == r or y == c) and ((dis := abs(x - r + y - c)) < smallest):
                smallest = dis
                res = i

        return res


# x = Solution().nearestValidPoint(
#     3, 4, [[1, 2], [3, 1], [2, 4], [2, 3], [4, 4]])
# print(x)
