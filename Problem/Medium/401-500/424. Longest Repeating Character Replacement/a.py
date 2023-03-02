# 102 ms

class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}
        n = len(s)

        max_freq = 0
        res = 0

        l = 0
        for r in range(n):
            ch = s[r]

            count[ch] = 1 + count.get(ch, 0)
            max_freq = max(max_freq, count[ch])

            if (r - l + 1) - max_freq > k:
                count[s[l]] -= 1
                l += 1

            res = max(res, r - l + 1)

        return res
