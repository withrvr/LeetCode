# 💀: will not work
# for nested example

class Solution:
    def decodeString(self, s: str) -> str:
        res = ""
        word = ""
        num = 0

        for ch in s:
            # print(ch, num, res, word)

            if '0' <= ch <= '9':
                num = int(ch)
            elif ch == '[':
                word = ""
            elif ch == ']':
                res += num * word
                word = ""
                num = 1
            else:
                word += ch

        res += (num * word)
        return res


print("`" + Solution().decodeString("3[a]2[bc]") + "`")
print("`" + Solution().decodeString("0[abcde]2[bc]") + "`")
print("`" + Solution().decodeString("2[abc]3[cd]ef") + "`")
print("`" + Solution().decodeString("3[a2[c]]") + "`")
