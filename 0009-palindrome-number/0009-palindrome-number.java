class Solution {
    public boolean isPalindrome(int x) {
         String stringNumber= ""+x+"";
         int j=0;
          for(int i=stringNumber.length()-1;i>=0;i--)
          {  if(stringNumber.charAt(i)!=stringNumber.charAt(j))
              return false;
              j++; 
          }
          return true;
    }
}