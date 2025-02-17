class Solution(object):
    def repeatedNTimes(self, nums):
         unique=[]
         for i in range(len(nums)):
            if nums[i] not in unique:
                unique.append(nums[i])
            else:
                return nums[i]
         return -1
        