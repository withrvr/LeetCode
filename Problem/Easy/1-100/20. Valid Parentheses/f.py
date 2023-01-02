# b.java logic
# like .... h.java
# Using Hash Maps

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
                stack.append(bracket[ch])
            elif len(stack) == 0 or stack.pop() != ch:
                return False

        return not stack  # len(stack) == 0
