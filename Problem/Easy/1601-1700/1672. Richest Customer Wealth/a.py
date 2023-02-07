class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        richest = 0

        for acc in accounts:
            richest = max(sum(acc), richest)

        return richest
