# dont use it
# just n solution

class Solution:
    def interpret(self, s: str) -> str:
        d = {"(al)": "al", "()": "o", "G": "G"}
        tmp = ""
        res = ""

        for i in range(len(s)):
            tmp += s[i]

            if (tmp in d):
                res += d[tmp]
                tmp = ""

        return res
