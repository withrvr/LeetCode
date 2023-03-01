class Solution:
    def climbStairs(self, n: int) -> int:
        a = b = 1

        for _ in range(1, n):
            a, b = b, a + b

        return b
