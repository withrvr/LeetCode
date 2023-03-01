class Solution:
    def fib(self, n):
        a = -1
        b = 1

        for _ in range(n + 1):
            a, b = b, a + b

        return b
