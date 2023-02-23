import math


class TreeNode:
    def __init__(self, val, left, right):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isValidBST(self, root):
        def validate(node, low, high):
            if not node:
                return True

            if not (low < node.val < high):
                return False

            return validate(node.left, low, node.val) and validate(node.right, node.val, high)

        return validate(root, -math.inf, math.inf)
