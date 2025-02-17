class Solution(object):
    def diStringMatch(self, s):
        result=[]
        i_counter=0
        j_counter=len(s)
        lengthOfS=len(s)
        for i in range(lengthOfS):
            if s[i]=='I':
                result.append(i_counter)
                i_counter+=1
            else:
                result.append(j_counter)
                j_counter-=1
        if s[len(s)-1]=='I':
            result.append(i_counter)
        else:
            result.append(j_counter)
        return result
        
        """
        :type s: str
        :rtype: List[int]
        """
        