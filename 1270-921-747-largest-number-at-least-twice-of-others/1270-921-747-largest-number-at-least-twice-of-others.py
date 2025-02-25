class Solution(object):
    def dominantIndex(self, nums):
        max=nums[0]
        secondMax=nums[1]
        index=0
        for i in range(len(nums)):
            if max<nums[i]:
                secondMax=max
                max=nums[i]
                index=i
            elif secondMax<nums[i] and i!=0:
                secondMax=nums[i]

        if(max>=secondMax*2):
            return index
        else: 
            return -1    
        """
        :type nums: List[int]
        :rtype: int
        """
        