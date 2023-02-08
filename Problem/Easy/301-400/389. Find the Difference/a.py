# 💀

# using sets to find the difference

# dont work for
# "a"
# "aa"


class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        # x = set(t).difference(set(s))
        # print(x)
        # print(type(x))
        # return x.pop()

        return set(t).difference(set(s)).pop()
