# split in words
# return last word len

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return len(s.split()[-1])
