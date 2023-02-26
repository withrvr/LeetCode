class Solution(object):
    def floodFill(self, image, sr, sc, new_color):
        m, n, orig_color = len(image), len(image[0]), image[sr][sc]

        def traverse(row, col):
            if (not (0 <= row < m and 0 <= col < n)) or image[row][col] != orig_color:
                return

            image[row][col] = new_color

            for (x, y) in ((0, 1), (1, 0), (0, -1), (-1, 0)):
                traverse(row + x, col + y)

        if orig_color != new_color:
            traverse(sr, sc)

        return image
