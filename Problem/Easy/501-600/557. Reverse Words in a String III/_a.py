# dont use this. ... _a.py
# use a.py

class Solution:
    def reverseWords(self, s: str) -> str:
        return ' '.join(x[::-1] for x in s.split())
