# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        l1 = []
        current = root
        result = []
        complete = False
        while complete != True:
            if current != None:
                l1.append(current)
                current = current.left
            else:
                if len(l1) != 0:
                    num = l1.pop()
                    result.append(num.val)
                    current = num.right
                else:
                    complete = True
        return result
