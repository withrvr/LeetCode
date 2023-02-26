# https://leetcode.com/problems/number-of-islands/solutions/56349/7-lines-python-14-lines-java/

class Solution:
    def numIslands(self, grid):
        rows, cols = len(grid), len(grid[0])

        def sink(i, j):
            if 0 <= i < rows and 0 <= j < cols and grid[i][j] == '1':
                grid[i][j] = '0'

                for dr, dc in (1, 0), (-1, 0), (0, -1), (0, 1):
                    sink(i+dr, j+dc)

                # print(f"{i} -- {j}")
                # will return 1 many times
                # but while sum ... only first one will be consider
                # which was used for initial call

                return 1

            return 0

        # sum = 0

        # for i in range(rows):
        #     for j in range(cols):
        #         x = sink(i, j)
        #         print(x)
        #         sum += x

        # return sum

        return sum(sink(i, j) for i in range(rows) for j in range(cols))
