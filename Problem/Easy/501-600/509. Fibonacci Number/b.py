# https://leetcode.com/problems/fibonacci-number/submissions/854027679/

class Solution:
    def fib(self, n: int) -> int:
        a = 0
        b = 1

        for i in range(n):
            a, b = b, a+b
            print(f"{i}: {a}")

        return a
