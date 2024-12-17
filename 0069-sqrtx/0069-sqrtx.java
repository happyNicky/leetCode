class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0)
         return x;
        double i;
        for( i=1;i<=x/2;i++)
        {    if(i*i>x)
              break;
        }
       return (int)(i-1);
    }
}