# a.java logic
# like g.java

class Solution:
    def isValid(self, s: str) -> bool:
        bracket = {
            '(': ')',
            '{': '}',
            '[': ']',
        }

        stack = []

        for ch in s:
            if ch in bracket:
                stack.append(ch)
            elif len(stack) == 0 or bracket[stack.pop()] != ch:
                return False

        return not stack  # len(stack) == 0
