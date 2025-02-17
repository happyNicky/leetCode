class Solution(object):
    def heightChecker(self, heights):
        expected=sorted(heights)
        result=0
        for i in range(len(heights)):
            if expected[i]!=heights[i]:
                result+=1
        return result
       
        """
        :type heights: List[int]
        :rtype: int
        """
        