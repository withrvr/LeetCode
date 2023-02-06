# space: O(n)

class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        # diff chars's position for each string

        # if len(s1) != len(s2):
        #     return False

        diff = []

        for i in range(len(s1)):
            if s1[i] != s2[i]:
                diff.append([s1[i], s2[i]])

            if len(diff) > 2:
                return False

        if len(diff) == 0:
            return True
        elif len(diff) == 1:
            return False

        # print(diff)
        return diff[0] == diff[1][::-1]
