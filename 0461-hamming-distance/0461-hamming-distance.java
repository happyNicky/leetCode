class Solution {
   public int hammingDistance(int x, int y) {
       x= x^y;
       String  a= Integer.toBinaryString(x);
       y=0;
        for(int i=0;i<a.length();i++)
        {   if(a.charAt(i)=='1')
              y++;
        }
        return y;
    }
}