# build in method
# just to let it know

import numpy as np


class Solution:
    # def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
    def matrixReshape(self, mat, r, c):
        try:
            x = np.reshape(mat, (r, c))
            y = x.tolist()

            print(x)
            print(y)

            return x
            # return y ... both work

            # return np.reshape(mat, (r, c))
            # return np.reshape(mat, (r, c)).tolist()

        except:
            return mat
