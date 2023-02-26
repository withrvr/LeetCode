# c.py short version

class Solution:
    def numIslands(self, grid):
        rows, cols = len(grid), len(grid[0])

        def sink(i, j):
            if 0 <= i < rows and 0 <= j < cols and grid[i][j] == '1':
                grid[i][j] = '0'

                for dr, dc in (1, 0), (-1, 0), (0, -1), (0, 1):
                    sink(i + dr, j + dc)

                return 1

            return 0

        return sum(sink(i, j) for i in range(rows) for j in range(cols))
