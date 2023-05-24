# using stack
# 38 ms

# tc: linear


class Solution:
    def decodeString(self, s: str) -> str:
        stack = []

        for ch in s:
            if ch != ']':
                stack.append(ch)
            else:
                word = ""
                num = ""

                while (pop := stack.pop()) != '[':
                    word = pop + word

                while stack and stack[-1].isdigit():
                    num = stack.pop() + num

                stack.append(int(num) * word)

            # print(stack)

        # special case
        res = ""
        for val in stack:
            if not val.isdigit():
                res += val

        return res


# print("`" + Solution().decodeString("3[a3[c]2[ab]ef]z") + "`")
# print("`" + Solution().decodeString("10[ab]") + "`")
# print("`" + Solution().decodeString("3[ab]34") + "`")
