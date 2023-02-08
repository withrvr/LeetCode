from numpy import reshape


class Solution:
    def matrixReshape(self, mat, r, c):
        try:
            return reshape(mat, (r, c))
        except:
            return mat
