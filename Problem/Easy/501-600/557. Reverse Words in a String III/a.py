# logic, explanation

# To Code : 3 min
# Execution : ? ms

# Time complexity: O(n + n)
# Space complexity: O(n)


class Solution:
    def reverseWords(self, s: str) -> str:
        return " ".join([val[::-1] for val in s.split(" ")])
