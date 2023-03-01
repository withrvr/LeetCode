import itertools


class Solution(object):
    def backspaceCompare(self, S, T):
        def helper(S):
            skip = 0
            for x in reversed(S):
                if x == '#':
                    skip += 1
                elif skip:
                    skip -= 1
                else:
                    yield x

        # return all(x == y for x, y in itertools.izip_longest(helper(S), helper(T)))
        return all(x == y for x, y in itertools.zip_longest(helper(S), helper(T)))
