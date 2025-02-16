class Solution(object):
    def isPerfectSquare(self, num):
        if num==1 or num==4:
            return True
        i=1
        j=num/2
        while i<=j:
            mid=(i+j)/2
            if mid*mid==num:
                return True
            elif mid*mid>num:
                j=mid-1
            else:
                i=mid+1
        return False
        """
        :type num: int
        :rtype: bool
        """
        