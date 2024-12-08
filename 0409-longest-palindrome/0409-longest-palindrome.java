class Solution {
    public int longestPalindrome(String s) {
         Map<Character,Integer> fre=new HashMap<>();
        boolean isOddFreq=false;
        for(char c:s.toCharArray())
         fre.put(c, fre.getOrDefault(c, 0)+1);
         int ret=0;
         for(int num:fre.values())
         {   if(num%2==0) ret+=num;
             else if(num%2!=0) 
             {ret+=(num-1);
              isOddFreq=true;
             }
          
         }
        if(isOddFreq) ret+=1;
            
         
         return ret; 
    }
}