import math


class Solution:
    def isValidBST(self, root):

        def in_order(root):
            if not root:
                return True

            if not in_order(root.left):
                return False

            if root.val <= self.prev:
                return False

            self.prev = root.val

            return in_order(root.right)

        self.prev = -math.inf
        return in_order(root)
