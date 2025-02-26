# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def searchBST(self, root, val):
        temp=root
        while temp!=None:
            if temp.val==val:
                return temp
            elif val>temp.val:
                temp=temp.right
            elif val<temp.val:
                temp=temp.left
        else:
            return None
        """
        :type root: Optional[TreeNode]
        :type val: int
        :rtype: Optional[TreeNode]
        """
        