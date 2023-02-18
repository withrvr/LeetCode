
class Solution:
    def minMaxDifference(self, num: int) -> int:
        s = str(num)
        a = b = s

        for i in range(len(s)):
            if a == s and s[i] != '9':
                a = s.replace(s[i], '9')

            if b == s and s[i] != '0':
                b = s.replace(s[i], '0')

            if a != s and b != s:
                break

        return int(a) - int(b)


print(Solution().minMaxDifference(90))
print(Solution().minMaxDifference(99999))
print(Solution().minMaxDifference(11891))
