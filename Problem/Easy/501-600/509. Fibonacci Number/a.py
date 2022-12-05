# https://leetcode.com/problems/fibonacci-number/submissions/854024025/

class Solution:
    def fib(self, n: int) -> int:
        a = -1
        b = 1

        for i in range(n+1):
            a, b = b, a+b
            print(f"{i}: {b}")

        return b