class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        # keep track of found differences
        first = -1
        second = -1

        for i in range(len(s1)):
            if s1[i] != s2[i]:
                if first == -1:
                    first = i
                elif second == -1:
                    second = i
                else:
                    # found more than two differences
                    return False

        return s1[first] == s2[second] and s1[second] == s2[first]
        # if differences are equal in cross then strings would become equal

        # incase first = -1 or second = -1
        # no need to write extra condition like in java
