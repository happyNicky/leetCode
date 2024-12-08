class Solution {
    public boolean isPowerOfFour(int n) {
         if(n==1)return true;
       return  (Math.log10(n)/Math.log10(2))%2==0;
        
    }
}