class Solution {
    public  String longestCommonPrefix(String[] strs) {
        int minLength=strs[0].length();
        String answer="";
         if(strs.length==1)
          return strs[0];
       for(int i=0;i<strs.length;i++) 
            {
                if(strs[i].length()<minLength)
                minLength=strs[i].length();
            }
        int i;
        for(i=0;i<minLength;i++)
        {   for(int j=1;j<strs.length;j++)
            {  if(strs[0].charAt(i)!=strs[j].charAt(i))
                 return answer;
            }
            answer+=strs[0].charAt(i);
        }

        return answer;
    }
}