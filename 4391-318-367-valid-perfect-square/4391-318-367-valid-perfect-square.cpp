class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==1 || num==4)
          return true;
        for(int p=1, i=1,j=num/2;i<=j;p++)
          {   int mid = i + (j - i) / 2;
             long square = (long) mid * mid;
              if(square==num)
                return true;
              else if(square>num)
                j=mid-1;
              else
                i=mid+1;

          }
          return false;
    }
};