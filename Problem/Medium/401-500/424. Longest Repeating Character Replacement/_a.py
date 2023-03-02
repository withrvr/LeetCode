# 102 ms

class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}
        n = len(s)

        window_len = max_freq = res = l = 0

        for r in range(n):
            window_len = r - l + 1
            ch = s[r]

            count[ch] = 1 + count.get(ch, 0)
            max_freq = max(max_freq, count[ch])

            if window_len - max_freq > k:
                count[s[l]] -= 1
                l += 1

                window_len -= 1  # IMP: since left will increase here

            res = max(res, window_len)

        return res
