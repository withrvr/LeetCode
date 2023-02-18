# Execution : 30 ms

class Solution:
    def reverseWords(self, s: str) -> str:
        # print(s.split())
        # print(s.split()[::-1])
        # print(" ".join(s.split()[::-1]))
        # print(" ".join(s.split()[::-1])[::-1])

        return " ".join(s.split()[::-1])[::-1]


# print(Solution().reverseWords("hello world here"))
